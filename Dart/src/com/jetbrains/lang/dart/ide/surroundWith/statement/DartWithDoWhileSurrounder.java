// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package com.jetbrains.lang.dart.ide.surroundWith.statement;

import com.intellij.openapi.util.NlsSafe;

public class DartWithDoWhileSurrounder extends DartLiteralAndBlockStatementSurrounderBase {
  @Override
  public String getTemplateDescription() {
    @NlsSafe String description = "do / while";
    return description;
  }

  @Override
  protected String getTemplateText() {
    return "do{\n} while(true);";
  }
}
