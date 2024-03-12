package com.crafttalk.chat.data.local.db.entity.settings

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Класс описывает все настройки и парметры которые получает нативный СДК
 */
data class SettingFromServerJSON(
    @SerializedName (value = "allowedSymbolsRegexp")
    var allowedSymbolsRegexp: String? = null,
    @SerializedName (value = "alwaysOpen")
    var alwaysOpen: Boolean? = null,
    @SerializedName (value = "authButtonText")
    var authButtonText: String? = null,
    @SerializedName (value = "baseColor")
    var baseColor: String? = null,
    @SerializedName (value = "block")
    var block: Boolean? = null,
    @SerializedName (value = "blockMessage")
    var blockMessage: String? = null,
    @SerializedName (value = "bottomPlacement")
    var bottomPlacement: Boolean? = null,
    @SerializedName (value = "captchaSiteKey")
    var captchaSiteKey: String? = null,
    @SerializedName (value = "chatAnnouncement")
    var chatAnnouncement: String? = null,
    @SerializedName (value = "clearNonValidUserData")
    var clearNonValidUserData: Boolean? = null,
    @SerializedName (value = "clickablePhoneNumber")
    var clickablePhoneNumber: Boolean? = null,
    @SerializedName (value = "clientNamespaceCobrowsing")
    var clientNamespaceCobrowsing: String? = null,
    @SerializedName (value = "cobrowsingEnabled")
    var cobrowsingEnabled: Boolean? = null,
    @SerializedName (value = "customCss")
    var customCss: String? = null,
    @SerializedName (value = "customTransport")
    var customTransport: List<String?> = listOf(null),
    @SerializedName (value = "disableClosing")
    var disableClosing: Boolean? = null,
    @SerializedName (value = "disableCompanyInformation")
    var disableCompanyInformation: Boolean? = null,
    @SerializedName (value = "disableHeader")
    var disableHeader: Boolean? = null,
    @SerializedName (value = "disableInitialOpen")
    var disableInitialOpen: Boolean? = null,
    @SerializedName (value = "disableOperatorImage")
    var disableOperatorImage: Boolean? = null,
    @SerializedName (value = "emojiUrl")
    var emojiUrl: String? = null,
    @SerializedName (value = "enableMobileVersion")
    var enableMobileVersion: Boolean? = null,
    @SerializedName (value = "fileRegexErrorMessage")
    var fileRegexErrorMessage: String? = null,
    @SerializedName (value = "forwardMessage")
    var forwardMessage: Boolean? = null,
    @SerializedName (value = "getInitialMessageFromWebhook")
    var getInitialMessageFromWebhook: Boolean?,
    @SerializedName (value = "headerDescription")
    var headerDescription: String? = null,
    @SerializedName (value = "headerText")
    var headerText: String? = null,
    @SerializedName (value = "hideMessageInfo")
    var hideMessageInfo: Boolean? = null,
    @SerializedName (value = "iFrameMode")
    var iFrameMode: String? = null,
    @SerializedName (value = "initialMessageOperatorName")
    var initialMessageOperatorName: String? = null,
    @SerializedName (value = "initialMessageText")
    var initialMessageText: String? = null,
    @SerializedName (value = "initialMessageWebhook")
    var initialMessageWebhook: String? = null,
    @SerializedName (value = "isDebugScenario")
    var isDebugScenario: Boolean? = null,
    @SerializedName (value = "language")
    var language: String? = null,
    @SerializedName (value = "linkOpeningBehaviour")
    var linkOpeningBehaviour: String? = null,
    @SerializedName (value = "locationMessage")
    var locationMessage: String? = null,
    @SerializedName (value = "logoColor")
    var logoColor: String? = null,
    @SerializedName (value = "namespace")
    var namespace: String? = null,
    @SerializedName (value = "notificationNewMessages")
    var notificationNewMessages: Boolean? = null,
    @SerializedName (value = "openChatButtonSelector")
    var openChatButtonSelector: String? = null,
    @SerializedName (value = "operatorIsTypingTimeout")
    var operatorIsTypingTimeout: Int? = null,
    @SerializedName (value = "operatorNameTemplate")
    var operatorNameTemplate: String? = null,
    @SerializedName (value = "oversizedFileErrorMessage")
    var oversizedFileErrorMessage: String? = null,
    @SerializedName (value = "personalDataText")
    var personalDataText: String? = null,
    @SerializedName (value = "phoneNumberMask")
    var phoneNumberMask: String? = null,
    @SerializedName (value = "promoAllowedUrls")
    var promoAllowedUrls: List<Any> = listOf(),
    @SerializedName (value = "promoHeight")
    var promoHeight: String? = null,
    @SerializedName (value = "promoTimeout")
    var promoTimeout: Int? = null,
    @SerializedName (value = "promoWelcomeMessage")
    var promoWelcomeMessage: String? = null,
    @SerializedName (value = "promoWidth")
    var promoWidth: String? = null,
    @SerializedName (value = "protocol")
    var protocol: String? = null,
    @SerializedName (value = "pushMessageBody")
    var pushMessageBody: String? = null,
    @SerializedName (value = "pushMessageBodyFromMessageText")
    var pushMessageBodyFromMessageText: Boolean?,
    @SerializedName (value = "pushMessageIcon")
    var pushMessageIcon: String? = null,
    @SerializedName (value = "pushMessageTag")
    var pushMessageTag: String? = null,
    @SerializedName (value = "pushMessageTimeout")
    var pushMessageTimeout: Int? = null,
    @SerializedName (value = "pushMessageTitle")
    var pushMessageTitle: String? = null,
    @SerializedName (value = "questionBeforeRatingDialog")
    var questionBeforeRatingDialog: Boolean? = null,
    @SerializedName (value = "ratingAliases")
    var ratingAliases: List<String?> = listOf(null),
    @SerializedName (value = "ratingAnswerText")
    var ratingAnswerText: String? = null,
    @SerializedName (value = "requireChatDraggable")
    var requireChatDraggable: Boolean? = null,
    @SerializedName (value = "requireChatResizing")
    var requireChatResizing: Boolean? = null,
    @SerializedName (value = "requireDialogFinishWithEstimate")
    var requireDialogFinishWithEstimate: Boolean? = null,
    @SerializedName (value = "requireScoreRequest")
    var requireScoreRequest: Boolean? = null,
    @SerializedName (value = "rootElement")
    var rootElement: String? = null,
    @SerializedName (value = "selectClickedButtons")
    var selectClickedButtons: Boolean? = null,
    @SerializedName (value = "sendInitialMessageOnOpen")
    var sendInitialMessageOnOpen: Boolean? = null,
    @SerializedName (value = "sendInitialMessageOnStartDialog")
    var sendInitialMessageOnStartDialog: Boolean? = null,
    @SerializedName (value = "sendUserIsTyping")
    var sendUserIsTyping: Boolean? = null,
    @SerializedName (value = "showClientServiceMessage")
    var showClientServiceMessage: Boolean? = null,
    @SerializedName (value = "showConnectedOperatorNotify")
    var showConnectedOperatorNotify: Boolean? = null,
    @SerializedName (value = "showFinishDialogByOperatorMessage")
    var showFinishDialogByOperatorMessage: Boolean? = null,
    @SerializedName (value = "showHistory")
    var showHistory: Boolean? = null,
    @SerializedName (value = "showImageDownloadLink")
    var showImageDownloadLink: Boolean? = null,
    @SerializedName (value = "showInitialMessage")
    var showInitialMessage: Boolean? = null,
    @SerializedName (value = "showOperatorName")
    var showOperatorName: Boolean? = null,
    @SerializedName (value = "showPromo")
    var showPromo: Boolean? = null,
    @SerializedName (value = "showRatingBox")
    var showRatingBox: Boolean? = null,
    @SerializedName (value = "socketIOFrontendHost")
    var socketIOFrontendHost: String? = null,
    @SerializedName (value = "socketIOInitialLoad")
    var socketIOInitialLoad: Boolean? = null,
    @SerializedName (value = "subscriptionRequestDelay")
    var subscriptionRequestDelay: Int? = null,
    @SerializedName (value = "swPublicKey")
    var swPublicKey: String? = null,
    @SerializedName (value = "textColor")
    var textColor: String? = null,
    @SerializedName (value = "uploadSizeLimit")
    var uploadSizeLimit: String? = null,
    @SerializedName (value = "useCaptcha")
    var useCaptcha: Boolean? = null,
    @SerializedName (value = "useEmoji")
    var useEmoji: Boolean? = null,
    @SerializedName (value = "usePersonalDataAgreement")
    var usePersonalDataAgreement: Boolean? = null,
    @SerializedName (value = "useSentry")
    var useSentry: Boolean? = null,
    @SerializedName (value = "userFormFields")
    var userFormFields: List<UserFormField>? = listOf(),
    @SerializedName (value = "userTypingInterval")
    var userTypingInterval: Int? = null,
    @SerializedName (value = "webchat_version")
    var webchat_version: WebchatVersion? = WebchatVersion(null,null, null)
) : Serializable {
}