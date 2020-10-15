package training.learn.lesson.swift.codegeneration

import training.learn.LessonsBundle
import training.learn.interfaces.Module
import training.learn.lesson.kimpl.*

class SwiftGenerateLesson(module: Module) : KLesson("swift.codegeneration.generate", LessonsBundle.message("swift.codegeneration.generate.name"), module, "Swift") {

  private val sample: LessonSample = parseLessonSample("""
import Foundation

class Action {
    var name: String?
}

class IDE {
    let version = 2018
    let build = "123"
    var codeGenerationActions:Array<Action>
    var name = "AppCode"
}""".trimIndent())
  override val lessonContent: LessonContext.() -> Unit = {
    prepareSample(sample)

    caret(12, 1)
    text(LessonsBundle.message("swift.codegeneration.generate.intro", code("equals"), code("hashValue"), code("description"),
                               code("debugDescription")))
    task {
      triggers("Generate", "Swift.Generate.Init")
      text(LessonsBundle.message("swift.codegeneration.generate.init", action("Generate"), LessonUtil.rawEnter()))
    }
    task {
      triggers("Swift.Generate.EqualsHashValue")
      text(LessonsBundle.message("swift.codegeneration.generate.hash", code("equals"), code("hash"), action("Generate")))
    }
    task {
      triggers("Swift.Generate.Description")
      text(LessonsBundle.message("swift.codegeneration.generate.description", code("description"), action("Generate")))
    }


  }
}