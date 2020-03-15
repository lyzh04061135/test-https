使用jdk自带的keytool生成本地秘钥
keytool -genkeypair -alias "test" -keyalg "RSA" -keystore "C:\Users\liuyuzhu\Downloads\java-project\test-https\src\main\resources\test.keystore"
keytool -importkeystore -srckeystore C:\Users\liuyuzhu\Downloads\java-project\test-https\src\main\resources\test.keystore -destkeystore C:\Users\liuyuzhu\Downloads\java-project\test-https\src\main\resources\test.keystore -deststoretype pkcs12
