import { Component } from '@angular/core';

/**
 * Using both the --inline-style and --inline-template options which generating this component,
 * both the template and styles can be included in the component-name.component.ts itself.
 */
@Component({
  selector: 'app-inline-template-and-component',
  template: `
    <h2 class="custom">
      inline-template-and-component works!
    </h2>
  `,
  styles: [`
      .custom {
          color: green;
      }
  `]
})
export class InlineTemplateAndComponentComponent {

}
