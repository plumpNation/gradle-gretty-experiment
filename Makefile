.PHONY: run debug clean build test help

.DEFAULT_GOAL := help

help:
	@grep -E '^[a-zA-Z_-]+:.*?## .*$$' $(MAKEFILE_LIST) | sort | awk 'BEGIN {FS = ":.*?## "}; {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}'

clean: ## Remove the build folder
	@./gradlew clean --console=plain

build: ## Build and test the application
	@./gradlew build --console=plain

test: ## Test the application
	@./gradlew test --console=plain

run: ## Run the application
	@./gradlew appRun --console=plain -t

debug: ## Run the application in debug mode
	@./gradlew appRunDebug --console=plain -t
