/*
 * Copyright DataGenerator Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.finra.datagenerator.engine.scxml.tags.boundary;

    import org.finra.datagenerator.engine.scxml.tags.boundary.action.BoundaryActionDecimal;

    import java.util.List;
    import java.util.Map;

/**
* Implementation of dg:positiveBoundHiveDecimal tag
*/
public class PositiveBoundHiveDecimal extends BoundaryDecimal<PositiveBoundHiveDecimal.PositiveBoundHiveDecimalTag> {

    public Class<PositiveBoundHiveDecimalTag> getTagActionClass() {
        return PositiveBoundHiveDecimalTag.class;
    }

    public String getTagName() {
        return "positiveBoundHiveDecimal";
    }

    public String getTagNameSpace() {
        return "org.finra.datagenerator";
    }

    /**
     * @param action            an Action of the type handled by this class
     * @param possibleStateList a current list of possible states produced so far from
     *                          expanding a model state
     * @return a list with positive boundary conditions assigned
     * to the variable
     */
    public List<Map<String, String>> pipelinePossibleStates(PositiveBoundHiveDecimalTag action,
                                                            List<Map<String, String>> possibleStateList) {

        return returnStates(action, possibleStateList, setParameters(action, true));
    }

    /**
     * A custom Action for the 'dg:positiveBoundHiveDecimal' tag inside models
     */
    public static class PositiveBoundHiveDecimalTag extends BoundaryActionDecimal { }

}

