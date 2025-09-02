import React, { useState } from 'react';

// The main component of our application.
// In React, components are functions that return JSX (HTML-like code).
const App = () => {
  // useState is a "hook" that lets you add state to a functional component.
  // It returns an array with two elements:
  // 1. `count`: the current state value (initially 0).
  // 2. `setCount`: a function to update the state value.
  const [count, setCount] = useState(0);

  // This function is our event handler.
  // It's called when the button is clicked and updates the state.
  const handleIncrement = () => {
    // We use the `setCount` function to update the `count` state.
    // React will automatically re-render the component with the new value.
    setCount(count + 1);
  };

  const handleDecrement = () => {
    // We use the `setCount` function to update the `count` state.
    // React will automatically re-render the component with the new value.
    setCount(count - 1);
  };

  // This is JSX, which looks like HTML but is a special syntax for React.
  // We can embed JavaScript expressions inside curly braces {}.
  return (
    <div className="flex items-center justify-center min-h-screen bg-gray-100 p-4">
      <div className="bg-white p-8 rounded-2xl shadow-lg border border-gray-200 w-full max-w-sm text-center">
        <h1 className="text-3xl font-bold text-gray-800 mb-6">Simple React Counter</h1>
        
        {/* We display the current value of our `count` state here */}
        <p className="text-6xl font-extrabold text-blue-600 my-8">{count}</p>
        
        <div className="flex justify-center space-x-4">
          {/* We attach our event handler to the button's `onClick` prop */}
          <button 
            onClick={handleDecrement}
            className="px-6 py-3 bg-red-500 text-white font-semibold rounded-full shadow-md hover:bg-red-600 transition-colors"
          >
            Decrement
          </button>
          <button 
            onClick={handleIncrement}
            className="px-6 py-3 bg-blue-500 text-white font-semibold rounded-full shadow-md hover:bg-blue-600 transition-colors"
          >
            Increment
          </button>
        </div>
      </div>
    </div>
  );
};

export default App;
