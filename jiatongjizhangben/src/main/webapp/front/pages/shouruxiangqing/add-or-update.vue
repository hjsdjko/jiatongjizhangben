<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					标题</view>
				<input disabled
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.shouruxiangqingName" type="text" v-model="ruleForm.shouruxiangqingName"
					placeholder="标题"></input>
			</view>
			<view
				:style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(218, 220, 219, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"108rpx"}'
				class="cu-form-group" @tap="shouruxiangqingPhotoTap">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					封面</view>
				<view class="right-input" style="padding:0;textAlign:left">
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-if="ruleForm.shouruxiangqingPhoto" :src="ruleForm.shouruxiangqingPhoto"
						mode="aspectFill">
					</image>
					<image
						:style='{"width":"68rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"68rpx"}'
						class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					收入金额</view>
				<input disabled
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.shouruxiangqingMoney" type="number" v-model="ruleForm.shouruxiangqingMoney"
					placeholder="收入金额"></input>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					收入类型</view>
				<picker @change="shouruxiangqingTypesChange" :value="shouruxiangqingTypesIndex"
					:range="shouruxiangqingTypesOptions" range-key="indexName">
					<view
						:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						class="uni-input">{{ruleForm.shouruxiangqingTypes?ruleForm.shouruxiangqingValue:"请选择收入类型"}}
					</view>
				</picker>
			</view>
			<!-- text后缀 -->
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"210rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}' class="title">
					备注</view>
				<textarea
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx","height":"200rpx"}'
					:disabled="ro.shouruxiangqingContent" v-model="ruleForm.shouruxiangqingContent" placeholder="备注" />
			</view>

			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#4477C5","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="date" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm" ref="insertTime"
			themeColor="#333333"></w-picker>
		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
			ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
				ro: {
					shouruxiangqingName: false,
					shouruxiangqingPhoto: false,
					shouruxiangqingMoney: false,
					shouruxiangqingTypes: false,
					yonghuId: false,
					shouruxiangqingContent: false,
					insertTime: false,
					createTime: false,
				},
				ruleForm: {
					shouruxiangqingName: '',
					shouruxiangqingPhoto: '',
					shouruxiangqingMoney: '',
					shouruxiangqingTypes: '', //数字
					shouruxiangqingValue: '', //数字对应的值
					yonghuId: '',
					shouruxiangqingContent: '',
					insertTime: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				shouruxiangqingTypesOptions: [],
				shouruxiangqingTypesIndex: 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

			/*下拉框*/
			let shouruxiangqingTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'shouruxiangqing_types',
			}
			let shouruxiangqingTypes = await this.$api.page(`dictionary`, shouruxiangqingTypesParams);
			this.shouruxiangqingTypesOptions = shouruxiangqingTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`shouruxiangqing`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.shouruxiangqingId) {
				this.ruleForm.shouruxiangqingId = options.shouruxiangqingId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			shouruxiangqingTypesChange(e) {
				this.shouruxiangqingTypesIndex = e.target.value
				this.ruleForm.shouruxiangqingValue = this.shouruxiangqingTypesOptions[this.shouruxiangqingTypesIndex]
					.indexName
				this.ruleForm.shouruxiangqingTypes = this.shouruxiangqingTypesOptions[this.shouruxiangqingTypesIndex]
					.codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


			shouruxiangqingPhotoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.shouruxiangqingPhoto = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(() => {
						// _this.styleChange()
					})
				});
			},
			// 日期控件
			insertTimeConfirm(val) {
				console.log(val)
				this.ruleForm.insertTime = val.result;
				this.$forceUpdate();
			},
			// 日期控件
			createTimeConfirm(val) {
				console.log(val)
				this.ruleForm.createTime = val.result;
				this.$forceUpdate();
			},




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.shouruxiangqingName)) {
					this.$utils.msg(`标题不能为空`);
					return
				}
				if ((!this.ruleForm.shouruxiangqingPhoto)) {
					this.$utils.msg(`封面不能为空`);
					return
				}
				if ((!this.ruleForm.shouruxiangqingMoney) && (!this.$validate.isIntNumer(this.ruleForm
						.shouruxiangqingMoney)) && this.ruleForm.shouruxiangqingMoney > 0) {
					this.$utils.msg(`收入金额不能为空，不能小于0 格式为数字`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`shouruxiangqing`, this.ruleForm);
				} else {
					await this.$api.save(`shouruxiangqing`, this.ruleForm);
				}
				uni.setStorageSync('pingluenStateState', true);
				this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>
