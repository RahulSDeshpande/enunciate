/*
 * Copyright 2006-2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codehaus.enunciate.modules.c.config;

import org.apache.commons.digester.Digester;
import org.apache.commons.digester.RuleSetBase;

/**
 * Rules for the configuration of the C client module.
 *
 * @author Ryan Heaton
 */
public class CRuleSet extends RuleSetBase {

  public void addRuleInstances(Digester digester) {
    digester.addCallMethod("enunciate/modules/c/facets/include", "addFacetInclude", 1);
    digester.addCallParam("enunciate/modules/c/facets/include", 0, "name");
    digester.addCallMethod("enunciate/modules/c/facets/exclude", "addFacetExclude", 1);
    digester.addCallParam("enunciate/modules/c/facets/exclude", 0, "name");
  }
}