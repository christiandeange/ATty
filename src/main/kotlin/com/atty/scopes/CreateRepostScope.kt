package com.atty.scopes

import com.atty.DisconnectReason
import com.atty.libs.BlueskyReadClient
import com.atty.models.GenericPostAttributes
import java.net.Socket

class CreateRepostScope(
    val genericPostAttributes: GenericPostAttributes,
    blueskyClient: BlueskyReadClient,
    clientSocket: Socket,
    disconnectHandler: (DisconnectReason) -> Unit,
    isCommodore: Boolean,
    threadProvider: () -> Thread) : BaseLoggedInScope(blueskyClient, clientSocket, isCommodore, threadProvider, disconnectHandler) {
        fun showReposted() {
            writeUi("Reposted")
        }
    }