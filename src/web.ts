import { WebPlugin } from '@capacitor/core';

import type { SystemThemeColorPlugin } from './definitions';

export class SystemThemeColorWeb extends WebPlugin implements SystemThemeColorPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
