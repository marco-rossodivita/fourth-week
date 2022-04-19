import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';
import { MatTableModule } from '@angular/material/table';
@NgModule({
  imports: [
    CommonModule,
    MatToolbarModule,
    MatTableModule,
    MatIconModule,
    MatButtonModule,
  ],
  exports: [
    CommonModule,
    MatToolbarModule,
    MatTableModule,
    MatIconModule,
    MatButtonModule,
  ],
})
export class MaterialModule {}
