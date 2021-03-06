/*
 * Copyright (2021) The Delta Lake Project Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.delta.standalone.internal

/** DeltaDataSource constants. */
object DeltaDataSource {
  // Constants for cdf parameters
  final val CDF_START_VERSION_KEY = "startingVersion"

  final val CDF_START_TIMESTAMP_KEY = "startingTimestamp"

  final val CDF_END_VERSION_KEY = "endingVersion"

  final val CDF_END_TIMESTAMP_KEY = "endingTimestamp"
}
