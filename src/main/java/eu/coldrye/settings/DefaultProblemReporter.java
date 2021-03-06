/*
 * Copyright 2018 coldrye.eu, Carsten Klein
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.coldrye.settings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @since 1.0.0
 */
class DefaultProblemReporter implements ProblemReporter {

  private Settings settings;

  private List<Problem> problems = new ArrayList<>();

  DefaultProblemReporter(Settings settings) {

    this.settings = settings;
  }

  @Override
  public Settings getSettings() {

    return settings;
  }

  public void reportProblem(Problem problem) {

    problems.add(problem);
  }

  public List<Problem> getProblems() {

    return Collections.unmodifiableList(problems);
  }
}
