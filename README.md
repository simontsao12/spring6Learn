# spring6Learn

## 專案概述

spring6Learn 是一個基於 Java 的學習專案，旨在練習 Spring 相關的概念與操作。專案按照不同的學習目標進行區分，每個子模組包含相關的測試程式與實現程式碼。

## 專案結構

```
spring6Learn/
├── pom.xml (父模組)
├── spring6_01-first/
│   └── pom.xml (子模組 spring6_01-first)
├── spring6_02-ioc-xml/
│   └── pom.xml (子模組 spring6_02-ioc-xml)
├── spring6_03-ioc-annotation/
│   └── pom.xml (子模組 spring6_03-ioc-annotation)
├── spring6_04-simon-ioc/
│   └── pom.xml (子模組 spring6_04-simon-ioc)
├── spring6_05-aop/
│   └── pom.xml (子模組 spring6_05-aop)
├── spring6_06-junit/
│   └── pom.xml (子模組 spring6_06-junit)
├── spring6_07-jdbc-tx/
│   └── pom.xml (子模組 spring6_07-jdbc-tx)
├── spring6_08-resources/
│   └── pom.xml (子模組 spring6_08-resources)
├── spring6_09-i18n/
│   └── pom.xml (子模組 spring6_09-i18n)
└── spring6_10-validator/
    └── pom.xml (子模組 spring6_10-validator)

```

### 1. spring6Learn


- **目標：** 管理所有子模組共同的依賴與版本。

  
### 2. spring6_01-first


- **目標：** 於 Spring 設定檔設定相關訊息，並於測試時載入 Spring 設定檔建立相關物件。

### 3. spring6_02-ioc-xml


- **目標 1：** 基於 XML 管理 Bean。
- **目標 2：** 不同方式的依賴注入。
- **目標 3：** 不同類型與情況的依賴注入。
- **目標 4：** Bean 作用域。
- **目標 5：** Bean 生命週期。
- **目標 6：** FactoryBean。
- **目標 7：** 自動裝配。

### 4. spring6_03-ioc-annotation


- **目標 1：** 基於注解管理 Bean。
- **目標 2：** @Autowired 注入。
- **目標 3：** @Resource 注入。
- **目標 4：** 全注解開發。

### 5. spring6_04-simon-ioc


- **目標：** 實現一個模擬的 IOC 和 DI 概念，幫助理解其原理。

### 6. spring6_05-aop


- **目標 1：** 代理模式。
- **目標 2：** AOP 概念。
- **目標 3：** 基於注解的 AOP。
- **目標 4：** 基於 XML 的 AOP。

### 7. spring6_06-junit


- **目標：** 整合 Junit 5 和 Junit 4。

### 8. spring6_07-jdbc-tx


- **目標 1：** JdbcTemplate 實現 CRUD。
- **目標 2：** 宣告式交易概念。
- **目標 3：** 基於注解的宣告式交易。
- **目標 4：** 基於 XML 的宣告式交易。

### 9. spring6_08-resources


- **目標 1：** 了解 Resource 介面和實現類。
- **目標 2：** 了解 ResourceLoader 介面。
- **目標 3：** 了解 ResourceLoaderAware 介面。
- **目標 4：** 使用 Resource 作為屬性。
- **目標 5：** 使用 ApplicationContext 實現類指定存取策略。

### 10. spring6_09-i18n


- **目標：**  Java 國際化基本操作。

### 11. spring6_10-validator


- **目標 1：** 透過 Validator 介面實現資料驗證。
- **目標 2：** 基於注解實現 Validation。
- **目標 3：** 基於方法實現 Validation。
- **目標 4：** 自定義驗證操作。

## 設定檔

- `log4j2.xml`： 日誌設定檔。
- `jdbc.properties`： 通用 JDBC 配置。

## 需求

- JDK 版本： 17
- Spring 版本： 6.0.7
- MySQL 版本： 8
- Maven 版本： 3.9.9

## 使用方式

1. **安裝依賴：** 確保已安裝 JDK 和相關資料庫，並設定相關依賴。
2. **配置資料庫：** 修改 `jdbc.properties` 等設定檔中的參數，以匹配您的資料庫設定。
3. **導入專案：** 使用 IDE（如 IntelliJ IDEA 或 Eclipse）導入專案。
4. **執行測試：** 選擇並運行對應的測試類進行學習。

## 注意事項

- 確保資料庫服務已啟動，並正確設定用戶名與密碼。
- 在執行涉及資源的操作時，請檢查相關文件路徑是否有效。

## 主要學習資源

- 【尚硅谷】2023最新版spring6課程。
- 【尚硅谷】SSM框架全套教程，MyBatis+Spring+SpringMVC+SSM整合一套通關。

## 貢獻者

此專案僅為學習用途。