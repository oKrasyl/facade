package org.example;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.core.SdkBytes;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.lambda.LambdaClient;
import software.amazon.awssdk.services.lambda.model.InvokeRequest;
import software.amazon.awssdk.services.lambda.model.InvokeResponse;
import software.amazon.awssdk.http.SdkHttpClient;
import software.amazon.awssdk.http.apache.ApacheHttpClient;

import java.net.URI;
public class RequestLambda {

    public static void main(String[] args) {
//        // Set up AWS credentials
//        AwsBasicCredentials credentials = AwsBasicCredentials.create("YOUR_ACCESS_KEY", "YOUR_SECRET_KEY");
//
//        // Set up custom HTTP client with the desired endpoint
//        SdkHttpClient httpClient = ApacheHttpClient.builder()
//                .build();
//
//        // Set the desired endpoint on the HTTP client
//        SdkHttpClient.Builder httpClientBuilder = httpClient.toBuilder()
//                .endpoint(URI.create("YOUR_LAMBDA_FUNCTION_URL"));
//
//        // Set up AWS Lambda client with the custom HTTP client
//        LambdaClient lambdaClient = LambdaClient.builder()
//                .region(Region.EU_WEST_1)
//                .credentialsProvider(() -> credentials)
//                .httpClientBuilder(httpClientBuilder)
//                .build();
//
//        // Create an InvokeRequest for the Lambda function
//        InvokeRequest request = InvokeRequest.builder()
//                .functionName("YOUR_LAMBDA_FUNCTION_NAME")
//                .payload(SdkBytes.fromUtf8String("{ \"key\": \"value\" }"))
//                .build();
//
//        // Invoke the Lambda function
//        InvokeResponse response = lambdaClient.invoke(request);
//
//        // Process the response
//        String resultPayload = response.payload().asUtf8String();
//        System.out.println("Lambda function response: " + resultPayload);



    }
}
