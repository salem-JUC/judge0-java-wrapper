# Java API Wrapper for Judge0API

A lightweight Java library that wraps around the Judge0 REST API to make it easy to submit code, run test cases, and retrieve results — without having to manually handle JSON, HTTP requests, or Base64 encoding.

## ✨ Features
- Simple API for creating and submitting code to the Judge0 service.
- Automatically encodes `source_code`, `stdin`, and `expected_output` to **Base64** — you only provide plain text.
- Retrieve submission results directly or via a token-based flow.
- Designed with a clean builder pattern for flexibility.
- Execute one code with multiple test cases to validate its correctness against different inputs and expected outputs.

---

## 📦 Installation

### Using Maven 
#### add this at pom.xml
```bash
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.salem-JUC</groupId>
        <artifactId>judge0-java-wrapper</artifactId>
        <version>1.0.0</version>
    </dependency>
</dependencies>
```

### Using Gradel
#### add this to build.gradel
```bash
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

dependencies {
	        implementation 'com.github.salem-JUC:judge0-java-wrapper:1.0.0'
	}

```
## 🚀 Getting Started

# Build the Judge0Client
```bash
Judge0Client client = new Judge0Client.Builder()
    .baseUrl("https://api.judge0.com")
    .apiKey("your-api-key") // if required
    .build();
```

# Create a Submission
```bash
Submission submission = new Submission.Builder()
    .languageId(52) // Example: 52 = Java
    .sourceCode("""
        public class Main {
            public static void main(String[] args) {
                System.out.println("Hello World");
            }
        }
    """)
    .stdin("Input data here")
    .expectedOutput("Hello World")
    .build();
```
You do not need to Base64 encode your values — the wrapper does it for you.

# Two Ways to Get Submission Results
```bash
  // **Direct Submission** – Submit your code and immediately get the result.
SubmissionResult result = client.submitAndGetResult(submission);

  // **Token-Based Submission** – Submit your code, receive a token, and fetch the result later using that token.
String token = client.submitAndGetToken(submission);

// Later, fetch result by token
SubmissionResult result = client.getSubmission(token);

```
# Create a submission and evaluate it against multiple test cases.
[![](https://jitpack.io/v/salem-JUC/judge0-java-wrapper.svg)](https://jitpack.io/#salem-JUC/judge0-java-wrapper)

---

**Author:** Salem Alsairi 
**GitHub:** [https://github.com/salem-JUC](https://github.com/salem-JUC)  
**Email:** salemalsairi@gmail.com
