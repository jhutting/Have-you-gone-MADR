package io.github.jhutting.madr.javadoc;

/**
 * This is a classic JavaDoc as you've been using it for years
 * {@snippet :
 *     // Example usage:
 *     var value = new Classic(1, "test");
 *}
 * <table>
 *     <caption><strong>Example data</strong></caption>
 *     <thead>
 *          <tr>
 *              <th>id</th><th>name</th>
 *          </tr>
 *     </thead>
 *     <tbody>
 *          <tr>
 *              <td>1</td><td>test</td>
 *          </tr>
 *          <tr>
 *              <td>2</td><td>another test</td>
 *          </tr>
 *     </tbody>
 * </table>
 * @param id an example id
 * @param name And the name linking to that {@link #id}, or was it {@link #id()}?
 */
public record Classic(long id, String name) { }
