export interface SystemThemeColorPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
