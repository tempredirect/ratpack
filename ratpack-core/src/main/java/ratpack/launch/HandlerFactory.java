/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ratpack.launch;

import ratpack.handling.Handler;

/**
 * A factory contract for creating handlers, typically the root handler of the application.
 * <p>
 * See {@link LaunchConfigBuilder#build(HandlerFactory)}.
 */
public interface HandlerFactory {

  /**
   * Creates a handler from the given launch config.
   *
   * @param launchConfig The application launch config
   * @return A handler
   * @throws Exception any if the handler cannot be created
   */
  Handler create(LaunchConfig launchConfig) throws Exception;

}