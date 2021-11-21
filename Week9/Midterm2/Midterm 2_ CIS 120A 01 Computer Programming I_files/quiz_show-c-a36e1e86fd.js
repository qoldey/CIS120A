(window["canvasWebpackJsonp"]=window["canvasWebpackJsonp"]||[]).push([[4e3],{E5fe:function(e,s,n){"use strict"
var t=n("ouhR")
var a=n.n(t)
const _={disableInputs(e){const s=a()("body"),n=a()("<div />",{class:"input_cover"})
n.on("mouseleave",(function(e){a()(this).remove()}))
a()(e).on("mouseenter",(function(e){const t=a()(this),_=n.clone(true)
_.css({height:t.height()+12,width:t.width()+12,position:"absolute",left:t.offset().left-6,top:t.offset().top-6,zIndex:15,background:"url(/images/blank.png) 0 0 repeat"})
s.append(_)}))},setWidths(e){a()(e||".answer input[type=text]").each((function(){a()(this).width(9.5*a()(this).val().length)}))}}
s["a"]=_},FtDy:function(e,s,n){"use strict"
var t=n("HGxv")
var a=n("8WeW")
Object(a["a"])(JSON.parse('{"ar":{"message_sent_9ff3a79d":"تم إرسال الرسالة!","message_students_for_course_name_e55f8077":"مراسلة الطلاب لـ %{course_name}","public_message_students":{"send_message":"إرسال رسالة"},"remove_student_from_recipients_4b206e35":"إزالة %{student} من قائمة المستلمين","send_message_6ccc90e8":"إرسال رسالة","sending_message_8ac5bc90":"جارٍ إرسال رسالة...","sending_message_failed_please_try_again_b53cc904":"فشل إرسال الرسالة، يرجى المحاولة مرة أخرى"},"ca":{"message_sent_9ff3a79d":"Missatge enviat!","message_students_for_course_name_e55f8077":"Envia un missatge als estudiants de %{course_name}","public_message_students":{"send_message":"Envia un missatge"},"remove_student_from_recipients_4b206e35":"Suprimeix %{student} dels destinataris","send_message_6ccc90e8":"Envia un missatge","sending_message_8ac5bc90":"S\'està enviant el missatge...","sending_message_failed_please_try_again_b53cc904":"No s\'ha pogut enviar el missatge, torneu-ho a provar"},"cy":{"message_sent_9ff3a79d":"Mae’r neges wedi’i hanfon!","message_students_for_course_name_e55f8077":"Anfon neges at Fyfyrwyr am %{course_name}","public_message_students":{"send_message":"Anfon Neges"},"remove_student_from_recipients_4b206e35":"Tynnu %{student} o’r rhestr derbynwyr","send_message_6ccc90e8":"Anfon Neges","sending_message_8ac5bc90":"Wrthi’n anfon neges...","sending_message_failed_please_try_again_b53cc904":"Wedi methu anfon neges, rhowch gynnig arall arni"},"da":{"message_sent_9ff3a79d":"Besked sendt!","message_students_for_course_name_e55f8077":"Send besked til studerende for %{course_name}","public_message_students":{"send_message":"Send besked"},"remove_student_from_recipients_4b206e35":"Fjern %{student} fra modtagere","send_message_6ccc90e8":"Send besked","sending_message_8ac5bc90":"Sender besked ...","sending_message_failed_please_try_again_b53cc904":"Afsendelse af besked mislykkedes, prøv igen"},"da-x-k12":{"message_sent_9ff3a79d":"Besked sendt!","message_students_for_course_name_e55f8077":"Send besked til elever for %{course_name}","public_message_students":{"send_message":"Send besked"},"remove_student_from_recipients_4b206e35":"Fjern %{student} fra modtagere","send_message_6ccc90e8":"Send besked","sending_message_8ac5bc90":"Sender besked ...","sending_message_failed_please_try_again_b53cc904":"Afsendelse af besked mislykkedes, prøv igen"},"de":{"message_sent_9ff3a79d":"Nachricht versandt!","message_students_for_course_name_e55f8077":"Studenten benachrichtigen wegen %{course_name}","public_message_students":{"send_message":"Nachricht senden"},"remove_student_from_recipients_4b206e35":"%{student} aus den Empfängern entfernen","send_message_6ccc90e8":"Nachricht senden","sending_message_8ac5bc90":"Nachricht wird gesendet ...","sending_message_failed_please_try_again_b53cc904":"Senden der Nachrichten ist fehlgeschlagen. Bitte erneut versuchen"},"el":{"message_sent_9ff3a79d":"Μήνυμα εστάλη!","message_students_for_course_name_e55f8077":"Αποστολή μηνύματος στους Σπουδαστές για το μάθημα %{course_name}","public_message_students":{"send_message":"Αποστολή Μηνύματος"},"remove_student_from_recipients_4b206e35":"Αφαίρεση του/της %{student} από τους παραλήπτες"},"en-AU":{"message_sent_9ff3a79d":"Message sent!","message_students_for_course_name_e55f8077":"Message students for %{course_name}","public_message_students":{"send_message":"Send Message"},"remove_student_from_recipients_4b206e35":"Remove %{student} from recipients","send_message_6ccc90e8":"Send Message","sending_message_8ac5bc90":"Sending Message...","sending_message_failed_please_try_again_b53cc904":"Sending Message Failed. Please try again."},"en-AU-x-unimelb":{"message_sent_9ff3a79d":"Message sent!","message_students_for_course_name_e55f8077":"Message students for %{course_name}","public_message_students":{"send_message":"Send Message"},"remove_student_from_recipients_4b206e35":"Remove %{student} from recipients","send_message_6ccc90e8":"Send Message","sending_message_8ac5bc90":"Sending Message...","sending_message_failed_please_try_again_b53cc904":"Sending Message Failed. Please try again."},"en-CA":{"message_sent_9ff3a79d":"Message sent!","message_students_for_course_name_e55f8077":"Message Students for %{course_name}","public_message_students":{"send_message":"Send Message"},"remove_student_from_recipients_4b206e35":"Remove %{student} from recipients","send_message_6ccc90e8":"Send Message","sending_message_8ac5bc90":"Sending Message...","sending_message_failed_please_try_again_b53cc904":"Sending Message Failed, please try again"},"en-GB":{"message_sent_9ff3a79d":"Message sent!","message_students_for_course_name_e55f8077":"Message students for %{course_name}","public_message_students":{"send_message":"Send message"},"remove_student_from_recipients_4b206e35":"Remove %{student} from recipients","send_message_6ccc90e8":"Send message","sending_message_8ac5bc90":"Sending message...","sending_message_failed_please_try_again_b53cc904":"Sending message failed. Please try again."},"en-GB-x-lbs":{"message_sent_9ff3a79d":"Message sent!","remove_student_from_recipients_4b206e35":"Remove %{student} from recipients","send_message_6ccc90e8":"Send message","sending_message_8ac5bc90":"Sending message...","sending_message_failed_please_try_again_b53cc904":"Sending message failed. Please try again."},"en-GB-x-ukhe":{"message_sent_9ff3a79d":"Message sent!","message_students_for_course_name_e55f8077":"Message students for %{course_name}","public_message_students":{"send_message":"Send message"},"remove_student_from_recipients_4b206e35":"Remove %{student} from recipients","send_message_6ccc90e8":"Send message","sending_message_8ac5bc90":"Sending message...","sending_message_failed_please_try_again_b53cc904":"Sending message failed. Please try again."},"es":{"message_sent_9ff3a79d":"¡Mensaje enviado!","message_students_for_course_name_e55f8077":"Mensaje a estudiantes para %{course_name}","public_message_students":{"send_message":"Enviar mensaje"},"remove_student_from_recipients_4b206e35":"Eliminar %{student} desde los destinatarios","send_message_6ccc90e8":"Enviar mensaje","sending_message_8ac5bc90":"Enviando mensaje...","sending_message_failed_please_try_again_b53cc904":"La presentación del mensaje ha fallado, inténtelo nuevamente"},"fa":{"message_sent_9ff3a79d":"پیام ارسال شد!","message_students_for_course_name_e55f8077":"ارسال پیام برای دانشجویان درس %{course_name}","public_message_students":{"send_message":"ارسال پیام"},"remove_student_from_recipients_4b206e35":"حذف %{student} از گیرنده ها","send_message_6ccc90e8":"ارسال پیام","sending_message_8ac5bc90":"در حال ارسال پیام...","sending_message_failed_please_try_again_b53cc904":"ارسال پیام انجام نشد، لطفا دوباره سعی کنید"},"fi":{"message_sent_9ff3a79d":"Viesti lähetetty!","message_students_for_course_name_e55f8077":"Lähetä viesti opiskelijoille, jotka%{course_name}","public_message_students":{"send_message":"Lähetä viesti"},"remove_student_from_recipients_4b206e35":"Poista %{student} vastaanottajilta","send_message_6ccc90e8":"Lähetä viesti","sending_message_8ac5bc90":"Lähetetään viestiä...","sending_message_failed_please_try_again_b53cc904":"Viestin lähetys epäonnistui, yritä uudelleen"},"fr":{"message_sent_9ff3a79d":"Message envoyé !","message_students_for_course_name_e55f8077":"Envoyer un message aux étudiants pour %{course_name}","public_message_students":{"send_message":"Envoyer message"},"remove_student_from_recipients_4b206e35":"Supprimer %{student} des destinataires","send_message_6ccc90e8":"Envoyer message","sending_message_8ac5bc90":"Envoi du message...","sending_message_failed_please_try_again_b53cc904":"L’envoi du message a échoué, veuillez réessayer"},"fr-CA":{"message_sent_9ff3a79d":"Message envoyé!","message_students_for_course_name_e55f8077":"Envoyer un message aux étudiants pour le cours %{course_name}","public_message_students":{"send_message":"Envoyer un message"},"remove_student_from_recipients_4b206e35":"Retirer %{student} des destinataires","send_message_6ccc90e8":"Envoyer un message","sending_message_8ac5bc90":"Envoi du message...","sending_message_failed_please_try_again_b53cc904":"L’envoi du message a échoué, veuillez réessayer"},"he":{"message_sent_9ff3a79d":"הודעה נשלחה!","message_students_for_course_name_e55f8077":"הודעה לתלמידי הקורס %{course_name}","public_message_students":{"send_message":"שליחת הודעה"},"remove_student_from_recipients_4b206e35":"הסרת %{student} מרשימת הנמענים","send_message_6ccc90e8":"שליחת הודעה","sending_message_8ac5bc90":"שולח הודעה...","sending_message_failed_please_try_again_b53cc904":"משלוח הודעה נכשל, יש לנסות שוב"},"ht":{"message_sent_9ff3a79d":"Mesaj ale!","message_students_for_course_name_e55f8077":"Voye mesaj bay Elèv pou %{course_name}","public_message_students":{"send_message":"Voye Mesaj"},"remove_student_from_recipients_4b206e35":"Elimine %{student} nan destinatè yo","send_message_6ccc90e8":"Voye Mesaj","sending_message_8ac5bc90":"Voye Mesaj...","sending_message_failed_please_try_again_b53cc904":"Echèk Anvwa mesaj, tanpri eseye ankò"},"hu":{"message_sent_9ff3a79d":"Az üzenet elküldve!","message_students_for_course_name_e55f8077":"Üzenet a következő kurzus hallgatóinak: %{course_name}","public_message_students":{"send_message":"Üzenetküldés"},"remove_student_from_recipients_4b206e35":"%{student} nevű címzett eltávolítása","send_message_6ccc90e8":"Üzenetküldés","sending_message_8ac5bc90":"Üzenet küldése...","sending_message_failed_please_try_again_b53cc904":"Az üzenet küldése sikertelen, kérjük, próbálja újra!"},"hy":{"message_sent_9ff3a79d":"Հաղորդագրությունն ուղարկված է","message_students_for_course_name_e55f8077":"Ուղարկել հաղորդագրություն %{course_name} ունկնդիրներին","public_message_students":{"send_message":"Ուղարկել հաղորդագրություն"},"remove_student_from_recipients_4b206e35":"Ջնջել %{student} -ին ստացողների ցանկից"},"is":{"message_sent_9ff3a79d":"Skilaboð send!","message_students_for_course_name_e55f8077":"Senda nemendum í námskeiðinu %{course_name} skilaboð","public_message_students":{"send_message":"Senda skilaboð"},"remove_student_from_recipients_4b206e35":"Fjarlægja %{student} úr viðtakendum","send_message_6ccc90e8":"Senda skilaboð","sending_message_8ac5bc90":"Sendi skilaboð ...","sending_message_failed_please_try_again_b53cc904":"Ekki tókst að senda skilaboð, reyndu aftur"},"it":{"message_sent_9ff3a79d":"Messaggio inviato.","message_students_for_course_name_e55f8077":"Invia messaggio agli studenti per %{course_name}","public_message_students":{"send_message":"Invia messaggio"},"remove_student_from_recipients_4b206e35":"Rimuovi %{student} dai destinatari","send_message_6ccc90e8":"Invia messaggio","sending_message_8ac5bc90":"Invio messaggio in corso...","sending_message_failed_please_try_again_b53cc904":"Invio messaggio non riuscito. Riprova"},"ja":{"message_sent_9ff3a79d":"メッセージが送信されました!","message_students_for_course_name_e55f8077":"%{course_name}の受講生にメッセージを送る","public_message_students":{"send_message":"メッセージを送信"},"remove_student_from_recipients_4b206e35":"受信者から%{student}を削除する","send_message_6ccc90e8":"メッセージを送信","sending_message_8ac5bc90":"メッセージを送信しています...","sending_message_failed_please_try_again_b53cc904":"メッセージの送信に失敗しました。もう一度やり直してください"},"ko":{"message_students_for_course_name_e55f8077":"%{course_name}의 학생 관리","public_message_students":{"send_message":"메시지 보내기"}},"mi":{"message_sent_9ff3a79d":"Karere kua tukuna!","message_students_for_course_name_e55f8077":"Karere ngā ākonga mō te %{course_name}","public_message_students":{"send_message":"Tukua Karere"},"remove_student_from_recipients_4b206e35":"Tangohia %{student} i ngā kaiwhiwhi","send_message_6ccc90e8":"Tukua Karere","sending_message_8ac5bc90":"Te tuku Karere ...","sending_message_failed_please_try_again_b53cc904":"Te tuku Karere rahua, tēnā ngana anō"},"nb":{"message_sent_9ff3a79d":"Melding sendt!","message_students_for_course_name_e55f8077":"Send beskjed til studenter i %{course_name}","public_message_students":{"send_message":"Send melding"},"remove_student_from_recipients_4b206e35":"Fjerne %{student} fra mottakerlisten","send_message_6ccc90e8":"Send melding","sending_message_8ac5bc90":"Sender melding...","sending_message_failed_please_try_again_b53cc904":"Sending av melding feilet, vennligst prøv igjen"},"nb-x-k12":{"message_sent_9ff3a79d":"Melding sendt!","message_students_for_course_name_e55f8077":"Send beskjed til elever i %{course_name}","public_message_students":{"send_message":"Send melding"},"remove_student_from_recipients_4b206e35":"Fjerne %{student} fra mottakerlisten","send_message_6ccc90e8":"Send melding","sending_message_8ac5bc90":"Sender melding...","sending_message_failed_please_try_again_b53cc904":"Sending av melding feilet, vennligst prøv igjen"},"nl":{"message_sent_9ff3a79d":"Bericht verzonden!","message_students_for_course_name_e55f8077":"Bericht naar cursisten voor %{course_name}","public_message_students":{"send_message":"Bericht versturen"},"remove_student_from_recipients_4b206e35":"%{student} uit geadresseerden verwijderen","send_message_6ccc90e8":"Bericht versturen","sending_message_8ac5bc90":"Bericht aan het versturen...","sending_message_failed_please_try_again_b53cc904":"Inleveren van bericht mislukt, probeer het opnieuw"},"nn":{"message_sent_9ff3a79d":"Meldinga er send","message_students_for_course_name_e55f8077":"Send melding til studentar i %{course_name}","public_message_students":{"send_message":"Send melding"},"remove_student_from_recipients_4b206e35":"Fjern %{student} frå mottakarar","send_message_6ccc90e8":"Send melding","sending_message_8ac5bc90":"Sender melding...","sending_message_failed_please_try_again_b53cc904":"Sending av melding mislukkast, prøv på nytt seinare"},"pl":{"message_sent_9ff3a79d":"Wiadomość wysłana!","message_students_for_course_name_e55f8077":"Wiadomość dla uczestników dot %{course_name}","public_message_students":{"send_message":"Wyślij wiadomość"},"remove_student_from_recipients_4b206e35":"Usuń %{student} z odbiorców","send_message_6ccc90e8":"Wyślij wiadomość","sending_message_8ac5bc90":"Wysyłanie wiadomości...","sending_message_failed_please_try_again_b53cc904":"Wysyłanie wiadomości nie powiodło się, spróbuj ponownie"},"pt":{"message_sent_9ff3a79d":"Mensagem enviada!","message_students_for_course_name_e55f8077":"Mensagem a alunos para %{course_name}","public_message_students":{"send_message":"Enviar Mensagem"},"remove_student_from_recipients_4b206e35":"Remover %{student} dos destinatários","send_message_6ccc90e8":"Enviar Mensagem","sending_message_8ac5bc90":"Enviando mensagem...","sending_message_failed_please_try_again_b53cc904":"Falha no envio da mensagem, tente novamente"},"pt-BR":{"message_sent_9ff3a79d":"Mensagem enviada!","message_students_for_course_name_e55f8077":"Enviar mensagem aos alunos para %{course_name}","public_message_students":{"send_message":"Enviar mensagem"},"remove_student_from_recipients_4b206e35":"Remover %{student} de destinatários","send_message_6ccc90e8":"Enviar mensagem","sending_message_8ac5bc90":"Enviando mensagem...","sending_message_failed_please_try_again_b53cc904":"Falha no envio da mensagem, tente novamente"},"ru":{"message_sent_9ff3a79d":"Сообщение отправлено!","message_students_for_course_name_e55f8077":"Отправить сообщение студентам для %{course_name}","public_message_students":{"send_message":"Отправить сообщение"},"remove_student_from_recipients_4b206e35":"Удалить %{student} из получателей","send_message_6ccc90e8":"Отправить сообщение","sending_message_8ac5bc90":"Отправка сообщения...","sending_message_failed_please_try_again_b53cc904":"Ошибка отправки сообщения, повторите попытку"},"sl":{"message_sent_9ff3a79d":"Sporočilo je poslano.","remove_student_from_recipients_4b206e35":"Odstrani študenta %{student} iz prejemnikov","send_message_6ccc90e8":"Pošlji sporočilo","sending_message_8ac5bc90":"Pošiljanje sporočila ...","sending_message_failed_please_try_again_b53cc904":"Pošiljanje sporočila ni uspelo, poskusite znova."},"sv":{"message_sent_9ff3a79d":"Meddelandet har skickats!","message_students_for_course_name_e55f8077":"Meddela studenter om %{course_name}","public_message_students":{"send_message":"Skicka meddelande"},"remove_student_from_recipients_4b206e35":"Ta bort %{student} från mottagare","send_message_6ccc90e8":"Skicka meddelande","sending_message_8ac5bc90":"Skickar meddelande ...","sending_message_failed_please_try_again_b53cc904":"Meddelandet skickades inte, försök igen"},"sv-x-k12":{"message_sent_9ff3a79d":"Meddelandet har skickats!","message_students_for_course_name_e55f8077":"Meddela elever om %{course_name}","public_message_students":{"send_message":"Skicka meddelande"},"remove_student_from_recipients_4b206e35":"Ta bort %{student} från mottagare","send_message_6ccc90e8":"Skicka meddelande","sending_message_8ac5bc90":"Skickar meddelande ...","sending_message_failed_please_try_again_b53cc904":"Meddelandet skickades inte, försök igen"},"tr":{"message_sent_9ff3a79d":"Mesaj gönderildi!","message_students_for_course_name_e55f8077":"%{course_name} dersi Öğrencilerine Mesaj Gönder","public_message_students":{"send_message":"Mesaj Gönder"},"send_message_6ccc90e8":"Mesaj Gönder","sending_message_8ac5bc90":"Mesajınız Gönderiliyor...","sending_message_failed_please_try_again_b53cc904":"Mesah gönderimi başarısız, lütfen tekrar deneyin"},"uk":{"message_sent_9ff3a79d":"Повідомлення відправлено!","message_students_for_course_name_e55f8077":"Повідомлення студентів для %{course_name}","public_message_students":{"send_message":"Відправити повідомлення"},"remove_student_from_recipients_4b206e35":"Видалити %{student} зі списку отримувачів","send_message_6ccc90e8":"Відправити повідомлення","sending_message_8ac5bc90":"Надіслати повідомлення...","sending_message_failed_please_try_again_b53cc904":"Не вдалося надіслати повідомлення, спробуйте ще раз"},"zh-Hans":{"message_sent_9ff3a79d":"邮件已发送！","message_students_for_course_name_e55f8077":"给学生发送%{course_name}的消息","public_message_students":{"send_message":"发送消息"},"remove_student_from_recipients_4b206e35":"从收件人中移除 %{student}","send_message_6ccc90e8":"发送消息","sending_message_8ac5bc90":"发送信息...","sending_message_failed_please_try_again_b53cc904":"发送信息失败，请再尝试"},"zh-Hant":{"message_sent_9ff3a79d":"訊息已發送！","message_students_for_course_name_e55f8077":"針對 %{course_name} 通知學生","public_message_students":{"send_message":"發送訊息"},"remove_student_from_recipients_4b206e35":"從收件人中刪除 %{student}","send_message_6ccc90e8":"傳送訊息","sending_message_8ac5bc90":"正在發送郵件...","sending_message_failed_please_try_again_b53cc904":"發送郵件失敗，請再試一次"}}'))
n("jQeR")
n("0sPK")
var _=t["default"].scoped("public_message_students")
var i=n("ouhR")
var o=n.n(i)
var r=n("plYi")
var c=n("FdVj")
n("Dhso")
n("ESjL")
n("aq8L")
let d={}
function g(){const e=l()
m(0==e.find("#body").val().length||0==e.find(".student:not(.blank):visible").length)}window.messageStudents=function(e){const s=l()
d=e
s.find(".message_types").empty()
for(let n=0,t=e.options.length;n<t;n++){const t=o()("<option/>")
const a=e.options[n]
t.val(n).text(a.text)
s.find(".message_types").append(t)}const n=e.title,t=s.find("ul li.blank:first"),a=s.find("ul"),i={}
s.find("ul li:not(.blank)").remove()
const c=e.students.slice()
c.sort(r["a"].byKey("sortableName"))
for(let e=0;e<c.length;e++){const s=c[e]
const n=t.clone(true).removeClass("blank")
n.find(".name").text(s.name)
n.find(".score").text(s.score)
const r=_.t("Remove %{student} from recipients",{student:s.name})
const d=n.find(".remove-button")
d.attr("title",r).append(o()("<span class='screenreader-only'></span>").text(r))
d.click((function(e){e.preventDefault()
const s=o()(this).closest("li")
s.hide("fast",g)
const n=s.nextAll(":visible:first")
n.length?o()("button",n).focus():o()("#message_assignment_recipients #subject").focus()}))
n.data("id",s.id)
n.user_data=s
a.append(n.show())
i[s.id]=n}a.show()
const u=_.t("Message Students for %{course_name}",{course_name:n})
s.data("students_hash",i),s.find(".asset_title").text(n)
s.find(".out_of").showIf(null!=e.points_possible)
s.find(".send_button").text(_.t("send_message","Send Message"))
s.find(".points_possible").text(_.n(e.points_possible))
s.find("[name=context_code]").val(e.context_code)
s.find("textarea").val("")
s.find("select")[0].selectedIndex=0
s.find("select").change()
s.dialog({width:600,modal:true,open:(e,n)=>{s.closest(".ui-dialog").attr("role","dialog").attr("aria-label",u)},close:(e,n)=>{s.closest(".ui-dialog").removeAttr("role").removeAttr("aria-label")}}).dialog("open").dialog("option","title",u).on("dialogclose",e.onClose)}
o()(document).ready(()=>{const e=l()
e.find("button").click(e=>{const s=o()(e.target)
if(s.hasClass("disabled")){e.preventDefault()
e.stopPropagation()}})
o()("#message_assignment_recipients").formSubmit({processData(e){const s=[]
o()(this).find(".student:visible").each((function(){s.push(o()(this).data("id"))}))
if(0==s.length)return false
e.recipients=s.join(",")
return e},beforeSubmit(e){u(true)
o()(this).find(".send_button").text(_.t("Sending Message..."))},success(e){o.a.flashMessage(_.t("Message sent!"))
u(false)
o()(this).find(".send_button").text(_.t("Send Message"))
o()("#message_students_dialog").dialog("close")},error(e){u(false)
o()(this).find(".send_button").text(_.t("Sending Message Failed, please try again"))}})
const s=function(){const s=parseInt(e.find("select").val(),10)||0
const n=d.options[s]
const t=e.data("students_hash")
let a=c["a"].parse(e.find(".cutoff_score").val())
isNaN(a)&&(a=null)
const _=Object.values(t)
let i=[]
t&&(n&&n.callback?i=n.callback.call(window.messageStudents,a,_):d.callback&&(i=d.callback.call(window.messageStudents,n.text,a,_)))
d.subjectCallback&&e.find("[name=subject]").val(d.subjectCallback(n.text,a))
e.find(".cutoff_holder").showIf(n.cutoff)
e.find(".student_list").toggleClass("show_score",!!(n.cutoff||n.score))
u(0===i.length)
const o=new Set(i)
Object.entries(t).forEach(([e,s])=>{s.showIf(o.has(e))})}
const n=function(){e.dialog("close")}
e.find(".cancel_button").click(n)
e.find("select").change(s).change(g)
e.find(".cutoff_score").bind("change blur keyup",s).bind("change blur keyup",g)
e.find("#body").bind("change blur keyup",g)})
function u(e,s){null==s&&(s=l().find("button"))
s.toggleClass("disabled",e).attr("aria-disabled",e)}function m(e){u(e,l().find(".send_button"))}function l(){return o()("#message_students_dialog")}s["a"]=messageStudents},cllE:function(e,s,n){"use strict"
var t=n("3O+N")
var a=n.n(t)
n("BGrI")
var _=a.a.default
var i=_.template,o=_.templates=_.templates||{}
var r="/work/canvas-deploy/generated/ui/shared/forms/jst/EmptyDialogFormWrapper"
o[r]=i((function(e,s,n,t,a){this.compilerInfo=[4,">= 1.0.0"]
n=this.merge(n,e.helpers)
a=a||{}
return'<div class="outlet"></div>\n'}))
s["a"]=o[r]},jRRY:function(e,s,n){"use strict"
n.r(s)
var t=n("ouhR")
var a=n.n(t)
var _=n("E5fe")
var i=n("An8g")
var o=n("YlS2")
n("q1tI")
var r=n("i8i4")
var c=n.n(r)
var d=n("HGxv")
var g=n("8WeW")
Object(g["a"])(JSON.parse('{"ar":{"message_sent_5e328899":"تم إرسال الرسالة!","message_students_37ba5dd5":"مراسلة الطلاب","message_students_for_context_ee62ff92":"مراسلة الطلاب لـ %{context}"},"ca":{"message_sent_5e328899":"Missatge enviat!","message_students_37ba5dd5":"Envia un missatge als estudiants","message_students_for_context_ee62ff92":"Envia un missatge als estudiants de %{context}"},"cy":{"message_sent_5e328899":"Mae’r neges wedi’i hanfon!","message_students_37ba5dd5":"Anfon neges at fyfyrwyr","message_students_for_context_ee62ff92":"Anfon neges at fyfyrwyr am %{context}"},"da":{"message_sent_5e328899":"Besked sendt!","message_students_37ba5dd5":"Send besked til studerende","message_students_for_context_ee62ff92":"Send besked til studerende for %{context}"},"da-x-k12":{"message_sent_5e328899":"Besked sendt!","message_students_37ba5dd5":"Send besked til elever","message_students_for_context_ee62ff92":"Send besked til elever for %{context}"},"de":{"message_sent_5e328899":"Nachricht wurde gesendet.","message_students_37ba5dd5":"Studenten benachrichtigen","message_students_for_context_ee62ff92":"Studenten benachrichtigen wegen %{context}"},"el":{"message_sent_5e328899":"Μήνυμα Εστάλη!","message_students_37ba5dd5":"Αποστολή μηνύματος στους μαθητές","message_students_for_context_ee62ff92":"Αποστολή μηνύματος στους σπουδαστές για %{context}"},"en-AU":{"message_sent_5e328899":"Message Sent!","message_students_37ba5dd5":"Message students","message_students_for_context_ee62ff92":"Message students for %{context}"},"en-AU-x-unimelb":{"message_sent_5e328899":"Message Sent!","message_students_37ba5dd5":"Message students","message_students_for_context_ee62ff92":"Message students for %{context}"},"en-CA":{"message_sent_5e328899":"Message Sent!","message_students_37ba5dd5":"Message students","message_students_for_context_ee62ff92":"Message students for %{context}"},"en-GB":{"message_sent_5e328899":"Message sent!","message_students_37ba5dd5":"Message students","message_students_for_context_ee62ff92":"Message students for %{context}"},"en-GB-x-ukhe":{"message_sent_5e328899":"Message sent!","message_students_37ba5dd5":"Message students","message_students_for_context_ee62ff92":"Message students for %{context}"},"es":{"message_sent_5e328899":"¡Mensaje enviado!","message_students_37ba5dd5":"Mensaje a estudiantes","message_students_for_context_ee62ff92":"Mensaje a estudiantes para %{context}"},"fa":{"message_sent_5e328899":"پیام ارسال شد!","message_students_37ba5dd5":"ارسال پیام برای دانشجویان","message_students_for_context_ee62ff92":"ارسال پیام برای دانشجویان برای %{context}"},"fi":{"message_sent_5e328899":"Viesti lähetetty!","message_students_37ba5dd5":"Lähetä viesti opiskelijoille","message_students_for_context_ee62ff92":"Lähetä viesti opiskelijoille tehtävästä %{context}"},"fr":{"message_sent_5e328899":"Message envoyé !","message_students_37ba5dd5":"Envoyer un message aux étudiants","message_students_for_context_ee62ff92":"Envoyer un message aux étudiants pour %{context}"},"fr-CA":{"message_sent_5e328899":"Message envoyé!","message_students_37ba5dd5":"Envoyer un message aux étudiants","message_students_for_context_ee62ff92":"Envoyer un message aux étudiants pour %{context}"},"he":{"message_sent_5e328899":"הודעה נשלחה!","message_students_37ba5dd5":"הודעות לתלמידים","message_students_for_context_ee62ff92":"הודע/י לתלמידים על %{context}"},"ht":{"message_sent_5e328899":"Mesaj Ale!","message_students_37ba5dd5":"Voye Mesaj bay Elèv","message_students_for_context_ee62ff92":"Voye Mesaj bay Elèv pou %{context}"},"hu":{"message_sent_5e328899":"Az üzenet elküldve!","message_students_37ba5dd5":"Üzenet a hallgatóknak","message_students_for_context_ee62ff92":"Üzenet a hallgatóknak: %{context}"},"hy":{"message_sent_5e328899":"Հաղորդագրությունն ուղարկված է:","message_students_37ba5dd5":"Հաղորդագրություն ուղարկել ունկնդիրներին","message_students_for_context_ee62ff92":"Հաղորդագրություն ուղարկել ունկնդիրներին  %{context} մասին"},"is":{"message_sent_5e328899":"Skilaboð send!","message_students_37ba5dd5":"Skilaboð til nemenda","message_students_for_context_ee62ff92":"Skilaboð til nemenda fyrir %{context}"},"it":{"message_sent_5e328899":"Messaggio inviato.","message_students_37ba5dd5":"Invia messaggio a studenti","message_students_for_context_ee62ff92":"Invia messaggio agli studenti per %{context}"},"ja":{"message_sent_5e328899":"メッセージが送信されました!","message_students_37ba5dd5":"受講生にメッセージを送る","message_students_for_context_ee62ff92":"%{context}の受講生にメッセージを送る"},"ko":{"message_sent_5e328899":"메시지를 보냈습니다!","message_students_37ba5dd5":"학생에게 메시지 보내기","message_students_for_context_ee62ff92":"학생에게 %{context}에 대한 메시지 보내기"},"mi":{"message_sent_5e328899":"Tukua Karere!","message_students_37ba5dd5":"ngā ākonga Karere","message_students_for_context_ee62ff92":"Ngā ākonga Karere mo %{context}"},"nb":{"message_sent_5e328899":"Melding sendt!","message_students_37ba5dd5":"Gi melding til studentene","message_students_for_context_ee62ff92":"Gi melding til studentene om %{context}"},"nb-x-k12":{"message_sent_5e328899":"Melding sendt!","message_students_37ba5dd5":"Gi melding til elevene","message_students_for_context_ee62ff92":"Gi melding til elevene om %{context}"},"nl":{"message_sent_5e328899":"Bericht verzonden!","message_students_37ba5dd5":"Bericht naar cursisten","message_students_for_context_ee62ff92":"Bericht naar cursisten voor %{context}"},"nn":{"message_sent_5e328899":"Melding er send.","message_students_37ba5dd5":"Send melding til studentane","message_students_for_context_ee62ff92":"Gi melding til studentane om %{context}"},"pl":{"message_sent_5e328899":"Wiadomość wysłana!","message_students_37ba5dd5":"Wiadomość dla uczestników","message_students_for_context_ee62ff92":"Wiadomość dla uczestników dot. %{context}"},"pt":{"message_sent_5e328899":"Mensagem enviada!","message_students_37ba5dd5":"Enviar mensagem a alunos","message_students_for_context_ee62ff92":"Mensagem a alunos para %{context}"},"pt-BR":{"message_sent_5e328899":"Mensagem enviada!","message_students_37ba5dd5":"Enviar mensagem de alunos","message_students_for_context_ee62ff92":"Enviar mensagem aos alunos para %{context}"},"ru":{"message_sent_5e328899":"Сообщение отправлено!","message_students_37ba5dd5":"Отправить сообщения студентам","message_students_for_context_ee62ff92":"Отправить сообщение студентам для %{context}"},"sv":{"message_sent_5e328899":"Meddelandet har skickats!","message_students_37ba5dd5":"Meddela studenter","message_students_for_context_ee62ff92":"Meddela studenter om %{context}"},"sv-x-k12":{"message_sent_5e328899":"Meddelandet har skickats!","message_students_37ba5dd5":"Meddela elever","message_students_for_context_ee62ff92":"Meddela elever som %{context}"},"tr":{"message_sent_5e328899":"Mesaj Gönderildi!","message_students_37ba5dd5":"Öğrencilere Mesaj Gönder","message_students_for_context_ee62ff92":"%{context} için Öğrencilere Mesaj"},"uk":{"message_sent_5e328899":"Повідомлення відправлено!","message_students_37ba5dd5":"Повідомлення студентів","message_students_for_context_ee62ff92":"Повідомлення студентів для %{context}"},"zh-Hans":{"message_sent_5e328899":"消息已发送！","message_students_37ba5dd5":"向学生发送消息","message_students_for_context_ee62ff92":"给学生发送%{context}的消息"},"zh-Hant":{"message_sent_5e328899":"訊息已傳送！","message_students_37ba5dd5":"通知學生","message_students_for_context_ee62ff92":"針對 %{context} 通知學生"}}'))
n("jQeR")
n("0sPK")
var u=d["default"].scoped("viewsMessageStudentsDialog")
var m=n("mT8+")
var l=n("3O+N")
var p=n.n(l)
n("BGrI")
var f=p.a.default
var b=f.template,h=f.templates=f.templates||{}
var v="/work/canvas-deploy/generated/ui/shared/message-students-dialog/jst/-messageStudentsWhoRecipientList"
h[v]=b((function(e,s,n,t,a){this.compilerInfo=[4,">= 1.0.0"]
n=this.merge(n,e.helpers)
a=a||{}
var _,i="",o="function",r=this.escapeExpression,c=this
function d(e,s){var t,a,_=""
_+='\n  <span class="label">\n    '
if(a=n.short_name)t=a.call(e,{hash:{},data:s})
else{a=e&&e.short_name
t=typeof a===o?a.call(e,{hash:{},data:s}):a}_+=r(t)+"\n  </span>\n"
return _}_=n.each.call(s,s&&s.recipients,{hash:{},inverse:c.noop,fn:c.program(1,d,a),data:a});(_||0===_)&&(i+=_)
i+="\n"
return i}))
f.registerPartial("ui/shared/message-students-dialog/jst/_messageStudentsWhoRecipientList.handlebars",h["/work/canvas-deploy/generated/ui/shared/message-students-dialog/jst/-messageStudentsWhoRecipientList"])
var y=h[v]
Object(g["a"])(JSON.parse('{"ar":{"cancel_caeb1e68":"إلغاء","recipients_a69b5e55":"المستلمون:","send_message_6ccc90e8":"إرسال رسالة","sending_bf324366":"جارٍ الإرسال...","sent_f4ee89ec":"تم الإرسال!"},"ca":{"cancel_caeb1e68":"Cancel·la","recipients_a69b5e55":"Destinataris:","send_message_6ccc90e8":"Envia un missatge","sending_bf324366":"S\'està enviant...","sent_f4ee89ec":"Enviat!"},"cy":{"cancel_caeb1e68":"Canslo","recipients_a69b5e55":"Derbynwyr:","send_message_6ccc90e8":"Anfon Neges","sending_bf324366":"Wrthi’n anfon...","sent_f4ee89ec":"Wedi anfon!"},"da":{"cancel_caeb1e68":"Annuller","recipients_a69b5e55":"Modtagere:","send_message_6ccc90e8":"Send besked","sending_bf324366":"Sender ...","sent_f4ee89ec":"Sendt!"},"da-x-k12":{"cancel_caeb1e68":"Annuller","recipients_a69b5e55":"Modtagere:","send_message_6ccc90e8":"Send besked","sending_bf324366":"Sender ...","sent_f4ee89ec":"Sendt!"},"de":{"cancel_caeb1e68":"Abbrechen","recipients_a69b5e55":"Empfänger:","send_message_6ccc90e8":"Nachricht senden","sending_bf324366":"Wird gesendet ...","sent_f4ee89ec":"Gesendet"},"el":{"cancel_caeb1e68":"Ακύρωση","recipients_a69b5e55":"Παραλήπτες:","sent_f4ee89ec":"Εστάλη!"},"en-AU":{"cancel_caeb1e68":"Cancel","recipients_a69b5e55":"Recipients:","send_message_6ccc90e8":"Send Message","sending_bf324366":"Sending...","sent_f4ee89ec":"Sent!"},"en-AU-x-unimelb":{"cancel_caeb1e68":"Cancel","recipients_a69b5e55":"Recipients:","send_message_6ccc90e8":"Send Message","sending_bf324366":"Sending...","sent_f4ee89ec":"Sent!"},"en-CA":{"cancel_caeb1e68":"Cancel","recipients_a69b5e55":"Recipients:","send_message_6ccc90e8":"Send Message","sending_bf324366":"Sending...","sent_f4ee89ec":"Sent!"},"en-GB":{"cancel_caeb1e68":"Cancel","recipients_a69b5e55":"Recipients:","send_message_6ccc90e8":"Send message","sending_bf324366":"sending...","sent_f4ee89ec":"Sent!"},"en-GB-x-lbs":{"cancel_caeb1e68":"Cancel","send_message_6ccc90e8":"Send message","sending_bf324366":"sending..."},"en-GB-x-ukhe":{"cancel_caeb1e68":"Cancel","recipients_a69b5e55":"Recipients:","send_message_6ccc90e8":"Send message","sending_bf324366":"sending...","sent_f4ee89ec":"Sent!"},"es":{"cancel_caeb1e68":"Cancelar","recipients_a69b5e55":"Destinatarios:","send_message_6ccc90e8":"Enviar mensaje","sending_bf324366":"Enviando...","sent_f4ee89ec":"¡Enviado!"},"fa":{"cancel_caeb1e68":"لغو","recipients_a69b5e55":"گیرنده ها:","send_message_6ccc90e8":"ارسال پیام","sending_bf324366":"در حال ارسال...","sent_f4ee89ec":"ارسال شد!"},"fi":{"cancel_caeb1e68":"Peruuta","recipients_a69b5e55":"Vastaanottajat:","send_message_6ccc90e8":"Lähetä viesti","sending_bf324366":"Lähetetään...","sent_f4ee89ec":"Lähetetty!"},"fr":{"cancel_caeb1e68":"Annuler","recipients_a69b5e55":"Destinataires :","send_message_6ccc90e8":"Envoyer message","sending_bf324366":"Envoi en cours...","sent_f4ee89ec":"Envoyé !"},"fr-CA":{"cancel_caeb1e68":"Annuler","recipients_a69b5e55":"Destinataires :","send_message_6ccc90e8":"Envoyer un message","sending_bf324366":"Envoi en cours...","sent_f4ee89ec":"Envoyé!"},"he":{"cancel_caeb1e68":"ביטול","recipients_a69b5e55":"נמענים:","send_message_6ccc90e8":"שליחת הודעה","sent_f4ee89ec":"נשלח!"},"ht":{"cancel_caeb1e68":"Anile","recipients_a69b5e55":"Destinatè:","send_message_6ccc90e8":"Voye Mesaj","sending_bf324366":"Voye...","sent_f4ee89ec":"Voye!"},"hu":{"cancel_caeb1e68":"Mégse","recipients_a69b5e55":"Címzettek:","send_message_6ccc90e8":"Üzenetküldés","sending_bf324366":"Küldés...","sent_f4ee89ec":"Elküldve!"},"hy":{"cancel_caeb1e68":"Չեղյալ համարել","recipients_a69b5e55":"Ստացողներ՝","sent_f4ee89ec":"Ուղարկվել է"},"is":{"cancel_caeb1e68":"Hætta við","recipients_a69b5e55":"Viðtakendur:","send_message_6ccc90e8":"Senda skilaboð","sending_bf324366":"Sendi...","sent_f4ee89ec":"Sent!"},"it":{"cancel_caeb1e68":"Annulla","recipients_a69b5e55":"Destinatari:","send_message_6ccc90e8":"Invia messaggio","sending_bf324366":"Invio in corso...","sent_f4ee89ec":"Inviato."},"ja":{"cancel_caeb1e68":"キャンセル","recipients_a69b5e55":"受信者:","send_message_6ccc90e8":"メッセージを送信","sending_bf324366":"送信しています...","sent_f4ee89ec":"送信されました!"},"ko":{"cancel_caeb1e68":"취소","recipients_a69b5e55":"수신인:","sent_f4ee89ec":"전송했습니다!"},"mi":{"cancel_caeb1e68":"Whakakore","recipients_a69b5e55":"Kaiwhiwhi:","send_message_6ccc90e8":"Tukua Karere","sending_bf324366":"Tuku ana ...","sent_f4ee89ec":"Tono!"},"nb":{"cancel_caeb1e68":"Avbryt","recipients_a69b5e55":"Mottakere:","send_message_6ccc90e8":"Send melding","sending_bf324366":"Sender...","sent_f4ee89ec":"Sendt!"},"nb-x-k12":{"cancel_caeb1e68":"Avbryt","recipients_a69b5e55":"Mottakere:","send_message_6ccc90e8":"Send melding","sending_bf324366":"Sender...","sent_f4ee89ec":"Sendt!"},"nl":{"cancel_caeb1e68":"Annuleren","recipients_a69b5e55":"Geadresseerden:","send_message_6ccc90e8":"Bericht versturen","sending_bf324366":"Bezig met verzenden...","sent_f4ee89ec":"Verstuurd!"},"nn":{"cancel_caeb1e68":"Avbryt","recipients_a69b5e55":"Mottakarar:","send_message_6ccc90e8":"Send melding","sending_bf324366":"Sender...","sent_f4ee89ec":"Send."},"pl":{"cancel_caeb1e68":"Anuluj","recipients_a69b5e55":"Odbiorcy:","send_message_6ccc90e8":"Wyślij wiadomość","sending_bf324366":"Trwa wysyłanie...","sent_f4ee89ec":"Wysłano!"},"pt":{"cancel_caeb1e68":"Cancelar","recipients_a69b5e55":"Destinatários:","send_message_6ccc90e8":"Enviar Mensagem","sending_bf324366":"A enviar...","sent_f4ee89ec":"Enviado!"},"pt-BR":{"cancel_caeb1e68":"Cancelar","recipients_a69b5e55":"Recipientes:","send_message_6ccc90e8":"Enviar mensagem","sending_bf324366":"Enviando...","sent_f4ee89ec":"Enviado!"},"ru":{"cancel_caeb1e68":"Отменить","recipients_a69b5e55":"Получатели:","send_message_6ccc90e8":"Отправить сообщение","sending_bf324366":"Отправка...","sent_f4ee89ec":"Отправлено!"},"sl":{"cancel_caeb1e68":"Prekliči","send_message_6ccc90e8":"Pošlji sporočilo","sending_bf324366":"Pošiljanje ..."},"sv":{"cancel_caeb1e68":"Avbryt","recipients_a69b5e55":"Mottagare:","send_message_6ccc90e8":"Skicka meddelande","sending_bf324366":"Skickar ...","sent_f4ee89ec":"Skickat!"},"sv-x-k12":{"cancel_caeb1e68":"Avbryt","recipients_a69b5e55":"Mottagare:","send_message_6ccc90e8":"Skicka meddelande","sending_bf324366":"Skickar ...","sent_f4ee89ec":"Skickat!"},"tr":{"cancel_caeb1e68":"İptal","recipients_a69b5e55":"Alıcılar:","send_message_6ccc90e8":"Mesaj Gönder","sent_f4ee89ec":"Gönderildi!"},"uk":{"cancel_caeb1e68":"Скасувати","recipients_a69b5e55":"Одержувачі:","send_message_6ccc90e8":"Відправити повідомлення","sending_bf324366":"Відправка...","sent_f4ee89ec":"Надісланий!"},"zh-Hans":{"cancel_caeb1e68":"取消","recipients_a69b5e55":"收件人：","send_message_6ccc90e8":"发送消息","sending_bf324366":"正在发送...","sent_f4ee89ec":"已发送！"},"zh-Hant":{"cancel_caeb1e68":"取消","recipients_a69b5e55":"收件者：","send_message_6ccc90e8":"傳送訊息","sending_bf324366":"正在發送...","sent_f4ee89ec":"已傳送！"}}'))
d["default"].scoped("message_students_dialog")
var k=n("dbrX")
var S=p.a.default
var x=S.template,M=S.templates=S.templates||{}
var w="/work/canvas-deploy/generated/ui/shared/message-students-dialog/jst/messageStudentsDialog"
M[w]=x((function(e,s,n,t,a){this.compilerInfo=[4,">= 1.0.0"]
n=this.merge(n,e.helpers)
t=this.merge(t,e.partials)
a=a||{}
var _,i,o,r="",c="function",d=this.escapeExpression,g=this,u=n.helperMissing
function m(e,s){var n,t=""
t+="\n      "+d((n=(n=(n=e&&e.recipientGroups,null==n||false===n?n:n[0]),null==n||false===n?n:n.name),typeof n===c?n.apply(e):n))+'\n      <input type="hidden" name="recipientGroupName" value="'+d((n=(n=(n=e&&e.recipientGroups,null==n||false===n?n:n[0]),null==n||false===n?n:n.name),typeof n===c?n.apply(e):n))+'" />\n    '
return t}function l(e,s){var t,a=""
a+='\n      <select name="recipientGroupName" id="message-recipients-group">\n        '
t=n.each.call(e,e&&e.recipientGroups,{hash:{},inverse:g.noop,fn:g.program(4,p,s),data:s});(t||0===t)&&(a+=t)
a+="\n      </select>\n    "
return a}function p(e,s){var t,a,_=""
_+='\n          <option value="'
if(a=n.name)t=a.call(e,{hash:{},data:s})
else{a=e&&e.name
t=typeof a===c?a.call(e,{hash:{},data:s}):a}_+=d(t)+'">'
if(a=n.name)t=a.call(e,{hash:{},data:s})
else{a=e&&e.name
t=typeof a===c?a.call(e,{hash:{},data:s}):a}_+=d(t)+"</option>\n        "
return _}r+='<div class="message-students-dialog form-dialog-content">\n  <div class="message-recipients-group-container">\n    <label for="message-recipients-group">\n     '+d((i=n.t||s&&s.t,o={hash:{i18n_inferred_key:true},data:a},i?i.call(s,"recipients_a69b5e55","Recipients:",o):u.call(s,"t","recipients_a69b5e55","Recipients:",o)))+"\n    </label>\n\n    "
_=(i=n.ifEqual||s&&s.ifEqual,o={hash:{},inverse:g.program(3,l,a),fn:g.program(1,m,a),data:a},i?i.call(s,(_=s&&s.recipientGroups,null==_||false===_?_:_.length),1,o):u.call(s,"ifEqual",(_=s&&s.recipientGroups,null==_||false===_?_:_.length),1,o));(_||0===_)&&(r+=_)
r+='\n  </div>\n\n  <div id="message-recipients">\n    '
_=g.invokePartial(t["ui/shared/message-students-dialog/jst/_messageStudentsWhoRecipientList.handlebars"],"ui/shared/message-students-dialog/jst/_messageStudentsWhoRecipientList.handlebars",s,n,t,a);(_||0===_)&&(r+=_)
r+='\n  </div>\n\n  <textarea name=body></textarea>\n\n</div>\n<div class="form-controls">\n  <button class="btn dialog_closer btn-secondary" type="button"\n    data-text-while-loading=\''+d((i=n.t||s&&s.t,o={hash:{i18n_inferred_key:true},data:a},i?i.call(s,"sending_bf324366","Sending...",o):u.call(s,"t","sending_bf324366","Sending...",o)))+"'>\n    "+d((i=n.t||s&&s.t,o={hash:{i18n_inferred_key:true},data:a},i?i.call(s,"cancel_caeb1e68","Cancel",o):u.call(s,"t","cancel_caeb1e68","Cancel",o)))+'\n  </button>\n  <button class="btn btn-primary"\n    data-text-while-loading=\''+d((i=n.t||s&&s.t,o={hash:{i18n_inferred_key:true},data:a},i?i.call(s,"sending_bf324366","Sending...",o):u.call(s,"t","sending_bf324366","Sending...",o)))+"'\n    data-text-when-loaded='"+d((i=n.t||s&&s.t,o={hash:{i18n_inferred_key:true},data:a},i?i.call(s,"sent_f4ee89ec","Sent!",o):u.call(s,"t","sent_f4ee89ec","Sent!",o)))+"'>\n    "+d((i=n.t||s&&s.t,o={hash:{i18n_inferred_key:true},data:a},i?i.call(s,"send_message_6ccc90e8","Send Message",o):u.call(s,"t","send_message_6ccc90e8","Send Message",o)))+"\n  </button>\n\n</div>\n"
return r}))
k["a"].loadStylesheetForJST({id:"e2",bundle:"jst/messageStudentsDialog"})
var E=M[w]
var j=n("cllE")
var z=n("LvDl")
var N=n.n(z)
Object(g["a"])(JSON.parse('{"ar":{"models_conversations":{"cannot_be_empty":"لا يمكن أن تكون الرسالة فارغة","no_recipients_choose_another_group":"لا يوجد مستلمون في هذه المجموعة. يرجى اختيار مجموعة أخرى."}},"ca":{"models_conversations":{"cannot_be_empty":"El missatge no pot estar en blanc","no_recipients_choose_another_group":"No hi ha cap destinatari al grup. Trieu un altre grup."}},"cy":{"models_conversations":{"cannot_be_empty":"Does dim modd i’r neges fod yn wag","no_recipients_choose_another_group":"Does dim derbynwyr yn y grŵp hwn Dewiswch grŵp arall."}},"da":{"models_conversations":{"cannot_be_empty":"Besked kan ikke være tom","no_recipients_choose_another_group":"Der er ingen modtagere i denne gruppe. Vælg venligst en anden gruppe."}},"da-x-k12":{"models_conversations":{"cannot_be_empty":"Besked kan ikke være tom","no_recipients_choose_another_group":"Der er ingen modtagere i denne gruppe. Vælg venligst en anden gruppe."}},"de":{"models_conversations":{"cannot_be_empty":"Nachricht darf nicht leer sein.","no_recipients_choose_another_group":"In dieser Gruppe gibt es keine Empfänger. Bitte wählen Sie eine andere Gruppe."}},"el":{"models_conversations":{"cannot_be_empty":"Το μήνυμα δεν μπορεί να είναι κενό.","no_recipients_choose_another_group":"Δεν υπάρχουν παραλήπτες σε αυτή την ομάδα. Παρακαλώ διαλέξτε μια άλλη ομάδα."}},"en-AU":{"models_conversations":{"cannot_be_empty":"Message cannot be blank","no_recipients_choose_another_group":"No recipients are in this group. Please choose another group."}},"en-AU-x-unimelb":{"models_conversations":{"cannot_be_empty":"Message cannot be blank","no_recipients_choose_another_group":"No recipients are in this group. Please choose another group."}},"en-CA":{"models_conversations":{"cannot_be_empty":"Message cannot be blank","no_recipients_choose_another_group":"No recipients are in this group. Please choose another group."}},"en-GB":{"models_conversations":{"cannot_be_empty":"Message cannot be blank","no_recipients_choose_another_group":"No recipients are in this group. Please choose another group."}},"en-GB-x-ukhe":{"models_conversations":{"cannot_be_empty":"Message cannot be blank","no_recipients_choose_another_group":"No recipients are in this group. Please choose another group."}},"es":{"models_conversations":{"cannot_be_empty":"El mensaje no puede estar vacío","no_recipients_choose_another_group":"No hay destinatarios en este grupo. Elija otro grupo."}},"fa":{"models_conversations":{"cannot_be_empty":"پیام نمی تواند خالی باشد","no_recipients_choose_another_group":"هیچ گیرنده ای در این گروه یافت نشد. گروه دیگری را انتخاب کنید."}},"fi":{"models_conversations":{"cannot_be_empty":"Viesti ei voi olla tyhjä","no_recipients_choose_another_group":"Tässä ryhmässä ei ole vastaanottajia. Valitse toinen ryhmä."}},"fr":{"models_conversations":{"cannot_be_empty":"Le message ne doit pas être vide","no_recipients_choose_another_group":"Aucun destinataire ne se trouve dans ce groupe. Veuillez sélectionner un autre groupe."}},"fr-CA":{"models_conversations":{"cannot_be_empty":"Le message ne doit pas être vide","no_recipients_choose_another_group":"Aucun destinataire n\'est dans ce groupe. Veuillez choisir un autre groupe."}},"he":{"models_conversations":{"cannot_be_empty":"הודעה אינה יכולה להשאר ריקה","no_recipients_choose_another_group":"אין נמענים בקבוצה זו. בבקשה לבחור קבוצה אחרת."}},"ht":{"models_conversations":{"cannot_be_empty":"Mesaj la pa dwe vid","no_recipients_choose_another_group":"Pa gen resipyan nan gwoup sa a. Tanpri chwazi yon lòt gwoup."}},"hu":{"models_conversations":{"cannot_be_empty":"Az üzenet nem lehet üres","no_recipients_choose_another_group":"Nincsenek címzettek ebben a csoportban. Kérjük, válasszon egy másik csoportot."}},"hy":{"models_conversations":{"cannot_be_empty":"Հաղորդագրությունը չի կարող դատարկ լինել","no_recipients_choose_another_group":"Այս խմբում ստացողներ չկան: Ընտրեք մեկ այլ խումբ:"}},"is":{"models_conversations":{"cannot_be_empty":"Skilaboð geta ekki verið auð","no_recipients_choose_another_group":"Engir móttakendur eru í þessum hóp. Veldu annan hóp."}},"it":{"models_conversations":{"cannot_be_empty":"Il messaggio non può essere lasciato vuoto","no_recipients_choose_another_group":"Non ci sono destinatari in questo gruppo. Scegli un altro gruppo."}},"ja":{"models_conversations":{"cannot_be_empty":"メッセージは空白にできません","no_recipients_choose_another_group":"このグループには受信者がいません。別のグループを選択してください。"}},"ko":{"models_conversations":{"cannot_be_empty":"메시지 내용이 있어야 함","no_recipients_choose_another_group":"이 그룹에 수신인이 없습니다. 다른 그룹을 선택하시기 바랍니다."}},"mi":{"models_conversations":{"cannot_be_empty":"E kore e taea e kore Karere","no_recipients_choose_another_group":"Kaore he kaiwhiwhi kei roto i tēnei rōpū. Tēnā koa kōwhiri he rōpūkē ake"}},"nb":{"models_conversations":{"cannot_be_empty":"Melding kan ikke være tom","no_recipients_choose_another_group":"Det er ingen mottakere i denne gruppen. Velg en annen gruppe."}},"nb-x-k12":{"models_conversations":{"cannot_be_empty":"Melding kan ikke være tom","no_recipients_choose_another_group":"Det er ingen mottakere i denne gruppen. Velg en annen gruppe."}},"nl":{"models_conversations":{"cannot_be_empty":"Bericht kan niet leeg zijn","no_recipients_choose_another_group":"Er zijn geen ontvangers in deze groep. Kies een andere groep."}},"nn":{"models_conversations":{"cannot_be_empty":"Meldinga kan ikkje vere tom","no_recipients_choose_another_group":"Det er ikkje mottakarar i denne gruppa. Vel ei anna gruppe."}},"pl":{"models_conversations":{"cannot_be_empty":"Wiadomość nie może być pusta","no_recipients_choose_another_group":"Brak odbiorców w tej grupie. Należy wybrać następną grupę."}},"pt":{"models_conversations":{"cannot_be_empty":"A mensagem não pode ficar em branco","no_recipients_choose_another_group":"Nenhum destinatário está neste grupo. Por favor, escolha outro grupo."}},"pt-BR":{"models_conversations":{"cannot_be_empty":"Mensagem não pode estar em branco","no_recipients_choose_another_group":"Nenhum destinatário está neste grupo. Escolha outro grupo."}},"ru":{"models_conversations":{"cannot_be_empty":"Сообщение не может быть пустым","no_recipients_choose_another_group":"В этой группе нет получателей. Выберите другую группу."}},"sv":{"models_conversations":{"cannot_be_empty":"Meddelandet kan inte lämnas tomt","no_recipients_choose_another_group":"Det finns inga mottagare i den här gruppen. Välj en annan grupp."}},"sv-x-k12":{"models_conversations":{"cannot_be_empty":"Meddelandet kan inte lämnas tomt","no_recipients_choose_another_group":"Det finns inga mottagare i den här gruppen. Välj en annan grupp."}},"tr":{"models_conversations":{"cannot_be_empty":"Mesaj boş olamaz","no_recipients_choose_another_group":"Bu grupta alıcılar bulunamadı. Lütfen farklı bir grup seçiniz."}},"uk":{"models_conversations":{"cannot_be_empty":"Повідомлення не може бути порожнім","no_recipients_choose_another_group":"Немає одержувачів, які належать до цієї групи. Будь ласка, оберіть іншу групу."}},"zh-Hans":{"models_conversations":{"cannot_be_empty":"消息不能为空","no_recipients_choose_another_group":"没有收件人在此小组。请选择其他小组。"}},"zh-Hant":{"models_conversations":{"cannot_be_empty":"訊息不可為空白","no_recipients_choose_another_group":"此群組沒有收件人。請選擇其他群組。"}}}'))
var I=d["default"].scoped("models_conversations")
var R=n("mX+G")
var A=function(e,s){for(var n in s)G.call(s,n)&&(e[n]=s[n])
function t(){this.constructor=e}t.prototype=s.prototype
e.prototype=new t
e.__super__=s.prototype
return e},G={}.hasOwnProperty
var V=function(e){var s,n
A(t,e)
function t(){return t.__super__.constructor.apply(this,arguments)}t.prototype.url="/api/v1/conversations"
s=I.t("cannot_be_empty","Message cannot be blank")
n=I.t("no_recipients_choose_another_group","No recipients are in this group. Please choose another group.")
t.prototype.validate=function(e,t){var _
_={}
e.body&&a.a.trim(e.body.toString())||(_.body=[{message:s}])
e.recipients&&e.recipients.length||(_.recipients=[{message:n}])
return Object.keys(_).length?_:void 0}
return t}(R["Model"])
var B=function(){function e(e){this.chunkSize=e.chunkSize||100}e.prototype.save=function(e,s){var n
e.context_code=ENV.context_asset_string
n=N.a.chunk(e.recipients,this.chunkSize).map((function(n){var t
t=Object.assign({},e,{recipients:n})
return(new V).save(t,s)}))
return a.a.when.apply(a.a,n)}
e.prototype.validate=function(e,s){return(new V).validate(e,s)}
return e}()
var D=n("Y/W1")
var q=n.n(D)
n("VrN0")
var O=function(e,s){return function(){return e.apply(s,arguments)}},U=function(e,s){for(var n in s)C.call(s,n)&&(e[n]=s[n])
function t(){this.constructor=e}t.prototype=s.prototype
e.prototype=new t
e.__super__=s.prototype
return e},C={}.hasOwnProperty
var L=function(e){U(s,e)
function s(){this.updateListOfRecipients=O(this.updateListOfRecipients,this)
this.getFormData=O(this.getFormData,this)
this._findRecipientGroupByName=O(this._findRecipientGroupByName,this)
this.validateBeforeSave=O(this.validateBeforeSave,this)
this.toJSON=O(this.toJSON,this)
return s.__super__.constructor.apply(this,arguments)}s.optionProperty("recipientGroups")
s.optionProperty("context")
s.prototype.template=E
s.prototype.wrapperTemplate=j["a"]
s.prototype.className="validated-form-view form-dialog"
s.prototype.defaults={height:500,width:500}
s.prototype.els={"[name=recipientGroupName]":"$recipientGroupName","#message-recipients":"$messageRecipients","[name=body]":"$messageBody"}
s.prototype.events=q.a.extend({},m["a"].prototype.events,{"change [name=recipientGroupName]":"updateListOfRecipients","click .dialog_closer":"close",dialogclose:"close"})
s.prototype.initialize=function(e){s.__super__.initialize.apply(this,arguments)
this.options.title=this.context?u.t("Message students for %{context}",{context:this.context}):u.t("Message students")
this.recipients=this.recipientGroups[0].recipients
return this.model||(this.model=new B({chunkSize:ENV.MAX_GROUP_CONVERSATION_SIZE}))}
s.prototype.toJSON=function(){var e,s,n,t,a
s={}
a=["title","recipients","recipientGroups"]
for(e=0,t=a.length;e<t;e++){n=a[e]
s[n]=this[n]}return s}
s.prototype.validateBeforeSave=function(e,s){var n
n=this.model.validate(e)
if(n){n.body&&(s.body=n.body)
n.recipients&&(s.recipientGroupName=n.recipients)}return s}
s.prototype._findRecipientGroupByName=function(e){return q.a.detect(this.recipientGroups,(function(s){return s.name===e}))}
s.prototype.getFormData=function(){var e,s,n,t
t=this.$el.toJSON(),s=t.recipientGroupName,e=t.body
n=this._findRecipientGroupByName(s).recipients
return{body:e,recipients:q.a.pluck(n,"id")}}
s.prototype.updateListOfRecipients=function(){var e,s
e=this.$recipientGroupName.val()
s=this._findRecipientGroupByName(e).recipients
return this.$messageRecipients.html(y({recipients:s}))}
s.prototype.onSaveSuccess=function(){this.close()
return a.a.flashMessage(u.t("Message Sent!"))}
s.prototype.close=function(){s.__super__.close.apply(this,arguments)
this.hideErrors()
return this.remove()}
return s}(m["a"])
var T=n("hFJA")
var W=n("3l1C")
var P=n("Vovh")
var F=n("EwH5")
var K=n("6dnZ")
n("7AEQ")
n("ESjL")
n("897F")
n("r2Yr")
n("aq8L")
n("sXof")
n("FtDy")
var H=n("VrCy")
var Q=n("QbG7")
var Z=n("Nuch")
a()(document).ready((function(){ENV.QUIZ_SUBMISSION_EVENTS_URL&&Object(F["a"])(true)
a()("#preview_quiz_button").click(e=>{a()("#js-sequential-warning-dialogue div a").attr("href",a()("#preview_quiz_button").attr("href"))})
function e(e){return a()("#quiz_details").length?e():a.a.get(ENV.QUIZ_DETAILS_URL,s=>{a()("#quiz_details_wrapper").html(s)
e()})}const s=new T["a"]
s.applyArrows()
if(!a()(".allow-inputs").length){_["a"].disableInputs("[type=radio], [type=checkbox]")
_["a"].setWidths()}a()("form.edit_quizzes_quiz").on("submit",(function(e){e.preventDefault()
e.stopImmediatePropagation()
a()(this).find(".loading").removeClass("hidden")
const s=a()(this).serializeArray()
const n=a()(this).attr("action")
a.a.ajax({url:n,data:s,type:"POST",success(){a()(".edit_quizzes_quiz").parents(".alert").hide()}})}))
a()(".delete_quiz_link").click((function(e){e.preventDefault()
let s=o["a"].t("confirms.delete_quiz","Are you sure you want to delete this quiz?")
const n=parseInt(a()("#quiz_details_wrapper").data("submitted-count"))
n>0&&(s+="\n\n"+o["a"].t("confirms.delete_quiz_submissions_warning",{one:"Warning: 1 student has already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook.",other:"Warning: %{count} students have already taken this quiz. If you delete it, any completed submissions will be deleted and no longer appear in the gradebook."},{count:n}))
a()("nothing").confirmDelete({url:a()(this).attr("href"),message:s,success(){window.location.href=ENV.QUIZZES_URL}})}))
let n=false
a()(".quiz_details_link").click(s=>{s.preventDefault()
a()("#quiz_details_wrapper").disableWhileLoading(e(()=>{const e=a()("#quiz_details_text")
a()("#quiz_details").slideToggle()
n?ENV.IS_SURVEY?e.text(o["a"].t("links.show_student_survey_results","Show Student Survey Results")):e.text(o["a"].t("links.show_student_quiz_results","Show Student Quiz Results")):ENV.IS_SURVEY?e.text(o["a"].t("links.hide_student_survey_results","Hide Student Survey Results")):e.text(o["a"].t("links.hide_student_quiz_results","Hide Student Quiz Results"))
n=!n}))})
a()(".message_students_link").click(s=>{s.preventDefault()
e(()=>{const e=ENV.QUIZ_SUBMISSION_LIST
const s=e.UNSUBMITTED_STUDENTS
const n=e.SUBMITTED_STUDENTS
const t=o["a"].t("students_who_have_taken_the_quiz","Students who have taken the quiz")
const a=o["a"].t("students_who_have_not_taken_the_quiz","Students who have NOT taken the quiz")
const _=new L({context:ENV.QUIZ.title,recipientGroups:[{name:t,recipients:n},{name:a,recipients:s}]})
_.open()})})
function t(e,s=true){e&&e.preventDefault()
c.a.render(Object(i["a"])(Q["a"],{open:s,sourceCourseId:ENV.COURSE_ID,contentShare:{content_type:"quiz",content_id:ENV.QUIZ.id},onDismiss:()=>{t(null,false)
a()(".al-trigger").focus()}}),document.getElementById("direct-share-mount-point"))}a()(".direct-share-send-to-menu-item").click(t)
function r(e,s=true){e&&e.preventDefault()
c.a.render(Object(i["a"])(Z["a"],{open:s,sourceCourseId:ENV.COURSE_ID,contentSelection:{quizzes:[ENV.QUIZ.id]},onDismiss:()=>{r(null,false)
a()(".al-trigger").focus()}}),document.getElementById("direct-share-mount-point"))}a()(".direct-share-copy-to-menu-item").click(r)
a()("#let_students_take_this_quiz_button").ifExists((function(e){const s=a()("#unlock_for_how_long_dialog")
e.click(()=>{s.dialog("open")
return false})
const n=a()(this).find(".datetime_field")
s.dialog({autoOpen:false,modal:true,resizable:false,width:400,buttons:{Unlock(){a()("#quiz_unlock_form").append(a()(this).dialog("destroy")).find("#quiz_lock_at").val(n.data("iso8601")).end().submit()}}})
n.datetime_field()}))
a()("#lock_this_quiz_now_link").ifExists(e=>{e.click(e=>{e.preventDefault()
a()("#quiz_lock_form").submit()})})
a()("ul.page-action-list").find("li").length>0&&a()("ul.page-action-list").show()
a()("#publish_quiz_form").formSubmit({beforeSubmit(e){a()(this).find("button").attr("disabled",true).text(o["a"].t("buttons.publishing","Publishing..."))},success(e){a()(this).find("button").text(o["a"].t("buttons.already_published","Published!"))
location.reload()}})
const d=a()("#quiz-publish-link")
const g=new W["a"](a.a.extend(ENV.QUIZ,{unpublishable:!d.hasClass("disabled")}))
const u=new P["a"]({model:g,el:d})
const m=function(){location.href=location.href}
u.on("publish",m)
u.on("unpublish",m)
u.render()
const l=document.getElementById("crs-graphs")
const p=document.getElementById("not_right_side")
K["default"].init(l,p)
a()("#assignment_external_tools").length&&H["a"].attach(a()("#assignment_external_tools")[0],"assignment_view",parseInt(ENV.COURSE_ID,10),parseInt(ENV.QUIZ.assignment_id,10))}))
n("VZGD")
n("fY8A")
var J=n("40dz")
const Y=new J["default"]
Y.init({itemType:"quiz",page:"show"})
a()(()=>{_["a"].setWidths()
a()(".answer input[type=text]").each((function(){a()(this).width(9.5*(a()(this).val().length||11))}))
a()(".download_submissions_link").click((function(e){e.preventDefault()
INST.downloadSubmissions(a()(this).attr("href"))}))
if(ENV.SUBMISSION_VERSIONS_URL&&!ENV.IS_SURVEY){const e=a()("#quiz-submission-version-table")
e.css({height:"100px"})
const s=a.a.get(ENV.SUBMISSION_VERSIONS_URL,s=>{e.html(s)
e.css({height:"auto"})})
e.disableWhileLoading(s)}a()("#module_sequence_footer").moduleSequenceFooter({courseID:ENV.COURSE_ID,assetType:"Quiz",assetID:ENV.QUIZ.id,location:location})})},plYi:function(e,s,n){"use strict"
var t=n("HGxv")
s["a"]={strings(e,s){let n=t["default"].locale||"en-US"
const a={zh_Hant:"zh-Hant"}
n=a[n]||n
return e.localeCompare(s,n,{sensitivity:"variant",ignorePunctuation:false,numeric:true})},by(e){return(s,n)=>this.strings(e(s),e(n))},byKey(e){return this.by(s=>s[e])},byGet(e){return this.by(s=>s.get(e))}}}}])

//# sourceMappingURL=quiz_show-c-a36e1e86fd.js.map