// Databricks notebook source
// MAGIC %sh
// MAGIC pip install pyspark
// MAGIC pip install dbt-postgres

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_root
// MAGIC dbt deps --profiles-dir /dbfs/FileStore/ryan/

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