import { Component } from '@angular/core';

/**
 * To use this component, include a html tag with the same name as the selector field in the decorator.
 * The contents of the html tag will be replaced with the contents in the user-list.component.html file.
 */
@Component({
  selector: 'user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent {

}
