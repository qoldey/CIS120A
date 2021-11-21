(window["canvasWebpackJsonp"]=window["canvasWebpackJsonp"]||[]).push([[159],{EwH5:function(e,t,s){"use strict"
var n=s("ko/W")
t["a"]=function(e){e&&n["a"].unregisterAllTrackers()
n["a"].isRunning()||n["a"].start()
if(n["a"].isDirty())return n["a"].deliver()}},L0Ie:function(e,t){if((""+location.search).match(/[?&]debug_js=1/))e.exports=console
else{function s(){}e.exports=["debug","info","log","warn","error"].reduce((e,t)=>{e[t]=s
return e},{})}},dbrX:function(e,t,s){"use strict"
var n=s("ODXe")
var r=s("uYtQ")
var i=s("QLaP")
var o=s.n(i)
const a={}
const l={getCssVariant(){const e=window.ENV.use_responsive_layout?"responsive_layout":"new_styles"
const t=window.ENV.use_high_contrast?"high_contrast":"normal_contrast"
const s=Object(r["c"])()?"_rtl":""
return`${e}_${t}${s}`},getHandlebarsIndex:()=>window.BRANDABLE_CSS_HANDLEBARS_INDEX||[[],{}],urlFor(e,{combinedChecksum:t,includesNoVariables:s}){const n=s?"no_variables":l.getCssVariant()
return[window.ENV.ASSET_HOST||"","dist","brandable_css",n,`${e}-${t}.css`].join("/")},loadStylesheet(e,t){if(e in a)return
const s=document.createElement("link")
s.rel="stylesheet"
s.href=l.urlFor(e,t)
s.setAttribute("data-loaded-by-brandableCss",true)
document.head.appendChild(s)},loadStylesheetForJST({bundle:e,id:t}){const s=l.getHandlebarsIndex(),r=Object(n["a"])(s,2),i=r[0],a=r[1]
o()(a.hasOwnProperty(t),`requested to load stylesheet for template "${e}" (${t}) but no mapping is available for it!`)
if(1===a[t].length)return l.loadStylesheet(e,{combinedChecksum:a[t][0],includesNoVariables:true})
{let s=a[t][i.indexOf(l.getCssVariant())]
"number"===typeof s&&(s=a[t][s])
return l.loadStylesheet(e,{combinedChecksum:s,includesNoVariables:false})}}}
t["a"]=l},hLjT:function(e,t){e.exports=e=>e.id.replace(/^question_/,"")},hpsT:function(e,t,s){"use strict"
s.d(t,"a",(function(){return n}))
function n(e,t){for(let s=0;s<e.length;s++){const n=e[s]
if(n===t){e.splice(s,1)
break}}return e}},"ko/W":function(e,t,s){"use strict"
var n={EVT_PAGE_FOCUSED:"page_focused",EVT_PAGE_BLURRED:"page_blurred",EVT_QUESTION_VIEWED:"question_viewed",EVT_QUESTION_FLAGGED:"question_flagged",EVT_SESSION_STARTED:"session_started",EVT_PRIORITY_LOW:0,EVT_PRIORITY_HIGH:100,EVT_STATE_PENDING_DELIVERY:"pending_delivery",EVT_STATE_IN_DELIVERY:"in_delivery",EVT_STATE_DELIVERED:"delivered",EVT_STORAGE_KEY:"qla_events",EVT_STORAGE_MEMORY:"memory",EVT_STORAGE_LOCAL_STORAGE:"localStorage"}
var r=s("Y/W1")
function i(){let e=Date.now()
return"xxxxxxxx-xxxx-4xxx-yxxx-xxxxxxxxxxxx".replace(/[xy]/g,t=>{const s=(e+16*Math.random())%16|0
e=Math.floor(e/16)
const n="x"===t?s:7&s|8
return n.toString(16)})}class o{static fromJSON(e){const t=new o(e.event_type,e.event_data)
t.recordedAt=new Date(e.client_timestamp)
return t}constructor(e,t){if(!e)throw new Error("An event type must be specified.")
this._id=i()
this._state=n.EVT_STATE_PENDING_DELIVERY
this.type=e
this.data=Object(r["clone"])(t)
this.recordedAt=new Date}isPendingDelivery(){return this._state===n.EVT_STATE_PENDING_DELIVERY}isBeingDelivered(){return this._state===n.EVT_STATE_IN_DELIVERY}wasDelivered(){return this._state===n.EVT_STATE_DELIVERED}toJSON(){return{event_type:this.type,event_data:this.data,client_timestamp:this.recordedAt}}toString(){return JSON.stringify(this.toJSON())}}class a{constructor(e){this._events=e}isEmpty(){return 0===this._events.length}markPendingDelivery(){return this._events.forEach(e=>e._state=n.EVT_STATE_PENDING_DELIVERY)}markBeingDelivered(){return this._events.forEach(e=>e._state=n.EVT_STATE_IN_DELIVERY)}toJSON(){return this._events.map(e=>e.toJSON())}}var l=s("L0Ie")
var u=s.n(l)
const c=[n.EVT_STORAGE_MEMORY,n.EVT_STORAGE_LOCAL_STORAGE]
class _{static setStorageAdapter(e){if(-1===c.indexOf(e))throw new Error(`Unsupported storage adapter "${e}". Available adapters are:\n${c.join(", ")}`)
return _.STORAGE_ADAPTER=e}constructor(){this.useLocalStorage=_.STORAGE_ADAPTER===n.EVT_STORAGE_LOCAL_STORAGE
this._events=this._load()||[]
u.a.debug("EventBuffer: using",this.constructor.STORAGE_ADAPTER,"for storage")}push(e){this._events.push(e)
return this._save()}isEmpty(){return 0===this._events.length}getLength(){return this._events.length}filter(e){return new a(this._events.filter(e))}discard(e){const t=e._events.map(e=>e._id)
this._events=this._events.filter(e=>-1===t.indexOf(e._id))
this._save()
return}toJSON(){return this._events.map(e=>e.toJSON())}_save(){if(this.useLocalStorage)try{localStorage.setItem(n.EVT_STORAGE_KEY,JSON.stringify(this.toJSON()))}catch(e){u.a.warn("Unable to save to localStorage, likely because we're out of space.")}return}_load(){if(this.useLocalStorage){const e=JSON.parse(localStorage.getItem(n.EVT_STORAGE_KEY)||"[]")
return e.map(e=>o.fromJSON(e))}return}}_.STORAGE_ADAPTER=n.EVT_STORAGE_MEMORY
var d=s("ouhR")
var h=s.n(d)
var E=s("hpsT")
const p={Accept:"application/json; charset=UTF-8","Content-Type":"application/json; charset=UTF-8"}
class g{constructor(e={}){this.options=Object(r["extend"])({},g.options,e)
this._trackerFactories=[]
this._state={trackers:[],buffer:null,deliveryAgent:null,deliveries:[],lastEventType:null}}registerTracker(e){return this._trackerFactories.push(e)}unregisterAllTrackers(){return this._trackerFactories=[]}start(){const e=this._state
e.buffer=new _
const t=this.options
const s=this._enqueue.bind(this)
function n(e,t){const n=new o(e.getEventType(),t)
return s(n,e.getDeliveryPriority())}e.trackers=this._trackerFactories.map(e=>{const t=new e
t.install(n.bind(null,t))
return t})
if(t.autoDeliver)return this._startDeliveryAgent()}isRunning(){return!!this._state.buffer}isDirty(){return this.isRunning()&&!this._state.buffer.isEmpty()}isDelivering(){return this._state.deliveries.length>0}deliver(){const e=this._state.buffer
const t=this._state.deliveries
const s=this.options
const n=e.filter(e=>e.isPendingDelivery())
if(n.isEmpty())return Object(d["when"])()
n.markBeingDelivered()
const r=Object(d["ajax"])({url:s.deliveryUrl,type:"POST",global:false,headers:p,data:JSON.stringify({quiz_submission_events:n.toJSON()}),error:s.errorHandler})
r.then(()=>e.discard(n),()=>n.markPendingDelivery())
const i=()=>Object(E["a"])(t,r)
r.then(i,i)
t.push(r)
return r}stop(e=false){const t=this._state
if(this.isDelivering()&&!e){console.warn("You are attempting to stop the QuizLogAuditing module while a delivery is in progress.")
return Object(d["when"])(t.deliveries).done(this.stop.bind(this,true))}t.buffer=null
t.deliveryAgent&&this._stopDeliveryAgent()
t.trackers.forEach(e=>e.uninstall())
t.trackers=[]
return Object(d["when"])()}_startDeliveryAgent(){return this._state.deliveryAgent=setInterval(this.deliver.bind(this),this.options.autoDeliveryFrequency)}_enqueue(e,t){if(e.type===n.EVT_PAGE_FOCUSED&&this._state.lastEventType!==n.EVT_PAGE_BLURRED)return false
this._state.buffer.push(e)
this._state.lastEventType=e.type
u.a.log(`Enqueuing ${e} for delivery.`)
if(t===n.EVT_PRIORITY_HIGH)return this.isDelivering()?Object(d["when"])(this._state.deliveries).done(this.deliver.bind(this)):this.deliver()}_stopDeliveryAgent(){return this._state.deliveryAgent=clearInterval(this._state.deliveryAgent)}}g.options={autoDeliver:true,autoDeliveryFrequency:15e3,deliveryUrl:"/quiz_submission_events"}
class T{constructor(e={}){this.eventType||(this.eventType=null)
this.priority||(this.priority=n.EVT_PRIORITY_LOW)
this._options=Object(r["extend"])({},this.options,e)
this.uid=`${this.eventType}_${Object(r["uniqueId"])()}`}install(e){throw new Error("Not implemented!")}getEventType(){return this.eventType}getDeliveryPriority(){return this.priority}getOption(e){return this._options[e]}uninstall(){if(this._bindings){this._bindings.forEach(e=>h()(e.selector).off(e.eventName))
return this._bindings=null}}bind(e,t,s,n={}){this._bindings||(this._bindings=[])
this._bindings.push({selector:e,eventName:t})
const i=parseInt(n.throttle||0,10)
i>0&&(s=Object(r["throttle"])(s,i,{leading:true,trailing:false}))
h()(e).on(`${t}.${this.eventType}`,s)}}class v extends T{install(e){return this.bind(window,"focus",()=>e(),{throttle:this.getOption("frequency")})}}v.prototype.eventType=n.EVT_PAGE_FOCUSED
v.prototype.options={frequency:5e3}
class f extends T{install(e){return this.bind(window,"blur",()=>{setTimeout(()=>{"IFRAME"!==document.activeElement.tagName&&e()})},{throttle:this.getOption("frequency")})}}f.prototype.eventType=n.EVT_PAGE_BLURRED
f.prototype.options={frequency:5e3}
const y=h()(window)
function S(e){const t=h()(e)
const s=y.scrollTop()
const n=s+y.height()
const r=t.offset().top
const i=r+t.height()
return s<r&&n>i}h.a.extend(h.a.expr[":"],{in_viewport:S})
var O=s("hLjT")
var b=s.n(O)
class A extends T{install(e,t=window){let s=[]
return this.bind(t,"scroll",()=>{const t=this.identifyVisibleQuestions().filter(e=>-1===s.indexOf(e))
if(t.length>0){s=s.concat(t)
u.a.log(`Student has just viewed the following questions: ${t}. (Questions viewed up until now are: ${s})`)
return e(t)}},{throttle:this.getOption("frequency")})}identifyVisibleQuestions(){return h()(".question[id]:visible").filter(":in_viewport").toArray().map(b.a)}}A.prototype.eventType=n.EVT_QUESTION_VIEWED
A.prototype.options={frequency:2500}
class D extends T{install(e){h()(document.body).on("click."+this.uid,this.getOption("buttonSelector"),t=>{const s=h()(t.target).closest(this.getOption("questionSelector"))
const n=s.hasClass(this.getOption("questionMarkedClass"))
const r=b()(s[0])
u.a.log(`Question ${r} ${n?"is now flagged":"is no longer flagged"}.`)
return e({flagged:n,questionId:r})})}}D.prototype.eventType=n.EVT_QUESTION_FLAGGED
D.prototype.options={buttonSelector:".flag_question",questionSelector:".question",questionMarkedClass:"marked"}
class w extends T{install(e){const t=navigator,s=t.userAgent
u.a.log(`I've been loaded by ${s}.`)
if(-1===location.href.indexOf("question")&&location.href.indexOf("take")>0)return e({user_agent:s})}}w.prototype.eventType=n.EVT_SESSION_STARTED
w.prototype.options={}
const V=[v,f,A,D,w]
const R=new g
V.forEach(e=>R.registerTracker(e))
u.a.debug("QuizLogAuditing: will be using localStorage.")
_.setStorageAdapter(n.EVT_STORAGE_LOCAL_STORAGE)
R.options.deliveryUrl=ENV.QUIZ_SUBMISSION_EVENTS_URL
R.options.errorHandler=function(e){console.log(e)
401!==e.status&&"Unauthorized"!==e.statusText||window.location.reload()}
t["a"]=R}}])

//# sourceMappingURL=159-c-bb86dd4191.js.map