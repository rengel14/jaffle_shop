// Databricks notebook source
// MAGIC %sh
// MAGIC pip install pyspark
// MAGIC pip install dbt-postgres

// COMMAND ----------

// MAGIC %sh
// MAGIC pwd

// COMMAND ----------

// MAGIC %sh
// MAGIC ls

// COMMAND ----------

// MAGIC %sh 
// MAGIC cd dbt_demo_root

// COMMAND ----------

// MAGIC %sh 
// MAGIC dbt deps --profiles-dir /dbfs/FileStore/ryan/

// COMMAND ----------

// MAGIC %sh 
// MAGIC dbt seed --profiles-dir /dbfs/FileStore/ryan/

// COMMAND ----------

// MAGIC %sh 
// MAGIC dbt run --profiles-dir /dbfs/FileStore/ryan/