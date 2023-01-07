import {NgModule} from '@angular/core';
import {BrowserModule} from '@angular/platform-browser';

import {AppComponent} from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import { InlineStyleComponent } from './inline-style/inline-style.component';
import { InlineTemplateComponent } from './inline-template/inline-template.component';
import { InlineTemplateAndComponentComponent } from './inline-template-and-component/inline-template-and-component.component';

@NgModule({
    declarations: [
        AppComponent,
        UserListComponent,
        InlineStyleComponent,
        InlineTemplateComponent,
        InlineTemplateAndComponentComponent
    ],
    imports: [
        BrowserModule
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
