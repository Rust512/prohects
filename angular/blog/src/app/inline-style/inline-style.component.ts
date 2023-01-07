import { Component } from '@angular/core';

/**
 * This component was generated using the command: "ng g c inline-style --inline-style"
 * Using this command, we can create a component for which, there is no component-name.component.css,
 * instead, we write the css for the component in the @Component decorator itself.
 */
@Component({
  selector: 'app-inline-style',
  templateUrl: './inline-style.component.html',
  styles: [
      `.custom {
          color: red;
      }`
  ]
})
export class InlineStyleComponent {

}
