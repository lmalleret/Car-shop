import { describe, test, expect } from 'vitest';
import { render, screen } from '@testing-library/react';
import App from './App';
import '@testing-library/jest-dom/vitest';

//msw (Mock Service Worker) and nock libraries for mock an API.
//Test will fail due secured backend
//Use libraries like axios-mock-adapter for mocking axios api request

describe("App tests", () => {
 test("component renders", () => {
 render(<App />);
 expect(screen.getByText(/Car Shop/i
 )).toBeInTheDocument();
 })
});