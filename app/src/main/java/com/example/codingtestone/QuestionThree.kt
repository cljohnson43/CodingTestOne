package com.example.codingtestone

typealias Floor = Array<Array<Room>>

const val INFECTION_THRESHOLD = 5
class QuestionThree {
    fun isOutbreak(floor: Floor): Boolean {
        for(i in floor.indices) {
            for (j in floor[i].indices) {
                val connections = connectionsRecursive(floor, i, j)
                if (connections >= INFECTION_THRESHOLD){
                    return true
                }
            }
        }

        return false
    }

    fun connectionsRecursive(floor: Floor, i: Int, j: Int): Int {
        if ( i < 0 || floor.size <= i) return 0;
        if (j < 0 || floor[i].size <= j) return 0;

        val room = floor[i][j];
        if (!room.isInfected) return 0;
        if (room.visited) return 0;

        room.visited = true

        return connectionsRecursive(floor, i, j+1) +
                connectionsRecursive(floor, i+1, j) +
                connectionsRecursive(floor, i, j-1) +
                connectionsRecursive(floor, i -1, j) +
                1
    }

}

