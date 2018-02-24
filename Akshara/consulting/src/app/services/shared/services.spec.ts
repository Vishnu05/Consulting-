import { Services } from './services';
import { addProviders, async, inject } from '@angular/core/testing';

describe('Services', () => {
  it('should create an instance', () => {
    expect(new Services()).toBeTruthy();
  });
});
