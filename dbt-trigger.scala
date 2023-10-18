// Databricks notebook source
// MAGIC %sh
// MAGIC pip install pyspark

// COMMAND ----------

// MAGIC %sh 
// MAGIC pip install dbt-postgres

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC pwd

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC ls

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC dbt --version

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC cat /dbfs/FileStore/ryan/profiles.yml

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC dbt init --profiles-dir /dbfs/FileStore/ryan/

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC dbt seed --profiles-dir /dbfs/FileStore/ryan/

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC dbt run --profiles-dir /dbfs/FileStore/ryan/

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC dbt clean --profiles-dir /dbfs/FileStore/ryan/