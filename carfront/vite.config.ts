import { defineConfig } from "vitest/config";
import react from "@vitejs/plugin-react-swc";

// https://vitejs.dev/config/
export default defineConfig({
  plugins: [react()],
  test: {
    //setupFiles: [./src/testSetup.ts] --> test configuration file
    globals: true,
    environment: "jsdom",
  },
});
