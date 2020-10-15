// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package training.learn.lesson.kimpl

import com.intellij.openapi.util.text.StringUtil
import training.ui.LearningUiManager
import javax.swing.Icon

/* Here can be defined common methods for any DSL level */
interface LearningDslBase {
  /** Show shortcut for [actionId] inside lesson step message */
  fun action(actionId: String): String {
    return "<action>$actionId</action>"
  }

  /** Highlight as code inside lesson step message */
  fun code(sourceSample: String): String  {
    return "<code>${StringUtil.escapeXmlEntities(sourceSample)}</code>"
  }

  /** Highlight some [text] */
  fun strong(text: String): String  {
    return "<strong>${StringUtil.escapeXmlEntities(text)}</strong>"
  }

  /** Show an [icon] inside lesson step message */
  fun icon(icon: Icon): String {
    val index = LearningUiManager.getIconIndex(icon)
    return "<icon_idx>$index</icon_idx>"
  }

  fun shortcut(key: String): String {
    return "<shortcut>${key}</shortcut>"
  }
}
