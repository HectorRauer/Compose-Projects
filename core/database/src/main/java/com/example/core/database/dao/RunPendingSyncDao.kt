package com.example.core.database.dao

import androidx.room.Query
import androidx.room.Upsert
import com.example.core.database.entity.DeleteRunSyncEntity
import com.example.core.database.entity.RunPendingSyncEntity

interface RunPendingSyncDao {
    //CREATED RUNS

    @Query("SELECT * FROM runpendingsyncentity WHERE userId=:userId")
    suspend fun getAllRunPendingSyncEntities(userId: String): List<RunPendingSyncEntity>

    @Query("SELECT * FROM runpendingsyncentity WHERE userId=:runId")
    suspend fun getRunPendingSyncEntity(runId: String): RunPendingSyncEntity?

    @Upsert
    suspend fun upsertRunPendingSyncEntity(entity: RunPendingSyncEntity)

    @Query("DELETE FROM runpendingsyncentity WHERE runId=:runId")
    suspend fun deleteRunPendingSyncEntity(runId: String)


    //DELETED RUNS
    @Query("SELECT * FROM deleterunsyncentity WHERE userId=:userId")
    suspend fun getAllDeletedRunsSyncEntities(userId: String): List<DeleteRunSyncEntity>

    @Upsert
    suspend fun upsertDeletedRunSyncEntity(entity: DeleteRunSyncEntity)

    @Query("DELETE FROM deleterunsyncentity WHERE runId=:runId")
    suspend fun deleteDeletedRunSyncEntity(runId: String)
}