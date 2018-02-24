import { Client } from './client';
import { addProviders, async, inject } from '@angular/core/testing';

describe('Client', () => {
  it('should create an instance', () => {
    expect(new Client()).toBeTruthy();
  });
});
