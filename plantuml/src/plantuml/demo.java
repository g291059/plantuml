/**
 * @startuml
 * participant "Alice" as A
 * participant "Bob" as B
 * participant "Software" as SW
 * note over A, SW : go to **http://plantuml.com/sequence.html**
 * B -[#blue]> A : hello
 * activate A
 * A -[#purple]> A : what to do
 * activate A
 * deactivate A
 * A -[#green]>] : alright
 * A <--] : yes
 * == second phase ==
 * hnote over B : idle
 * rnote over A
 *  "r" as rectangle
 *  "h" as hexagon
 * endrnote
 * deactivate A 
 * A --> B : ok
 * activate B
 * note over A, SW : none
 * == third phase ==
 * ref over B, SW : reference
 * deactivate B
 * == 4th phase ==
 * A -> B : hello --there--
 * ... Some ~~long delay~~ ...
 * B -> A : ok
 * note left
 *  This is **bold**
 *	This is //italics//
 *	This is ""monospaced""
 *	This is --stroked--
 *	This is __underlined__
 *	This is ~~waved~~
 * end note
 * A -> B : A //well formatted// message
 * note right of A 
 *  This is <back:cadetblue><size:18>displayed</size></back> 
 *  __left of__ Alice. 
 * end note
 * note left of B 
 *   <u:red>This</u> is <color #118888>displayed</color> 
 *   **<color purple>left of</color> <s:red>Alice</strike> Bob**. 
 * end note
 * note over A, B
 *   <w:#FF33FF>This is hosted</w> by 
 * end note 
 * @enduml
 * 
 * 
 */
package plantuml;

public class demo {
/*

*/
}
