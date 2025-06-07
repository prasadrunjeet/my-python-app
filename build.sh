#!/bin/bash

set -e  # Exit immediately if a command exits with a non-zero status

echo "✅ Starting Python build process..."

echo "📦 Creating virtual environment..."
python3 -m venv venv
source venv/bin/activate

echo "⬇️ Installing dependencies..."
pip install --upgrade pip
pip install -r requirements.txt

echo "🧪 Running unit tests..."
python -m unittest test_app.py

echo "✅ Build and tests completed successfully!"
