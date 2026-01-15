// swift-tools-version: 5.9
import PackageDescription

let package = Package(
    name: "SystemThemeColor",
    platforms: [.iOS(.v15)],
    products: [
        .library(
            name: "SystemThemeColor",
            targets: ["SystemThemeColorPlugin"])
    ],
    dependencies: [
        .package(url: "https://github.com/ionic-team/capacitor-swift-pm.git", from: "8.0.0")
    ],
    targets: [
        .target(
            name: "SystemThemeColorPlugin",
            dependencies: [
                .product(name: "Capacitor", package: "capacitor-swift-pm"),
                .product(name: "Cordova", package: "capacitor-swift-pm")
            ],
            path: "ios/Sources/SystemThemeColorPlugin"),
        .testTarget(
            name: "SystemThemeColorPluginTests",
            dependencies: ["SystemThemeColorPlugin"],
            path: "ios/Tests/SystemThemeColorPluginTests")
    ]
)