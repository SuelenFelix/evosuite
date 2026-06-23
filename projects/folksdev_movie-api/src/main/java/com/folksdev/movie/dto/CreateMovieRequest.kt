package com.folksdev.movie.dto

import com.folksdev.movie.model.GenresType
import javax.validation.constraints.*

class CreateMovieRequest(
    @field:NotBlank
    val title: String?,
    description: String?,
    imdbUrl: String?,
    duration: Int?,
    featuredYear: Int?,
    genresType: List<GenresType>?,
    actorIds: List<String>?,
    publisherId: String?,
    directorId: String?
) : BaseMovieRequest(description, imdbUrl, duration, featuredYear, genresType, actorIds, publisherId, directorId)
