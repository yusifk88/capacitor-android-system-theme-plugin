import { registerPlugin } from '@capacitor/core';

import type { SystemThemeColorPlugin } from './definitions';

const SystemThemeColor = registerPlugin<SystemThemeColorPlugin>('SystemThemeColor', {
  web: () => import('./web').then((m) => new m.SystemThemeColorWeb()),
});

export * from './definitions';
export { SystemThemeColor };
