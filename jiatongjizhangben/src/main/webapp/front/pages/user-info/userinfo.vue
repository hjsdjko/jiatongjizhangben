<template>
	<view class="content">
		 <view
				 :style='{"boxShadow":"0 0 2rpx #07588D","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"#4477C5","margin":"0 0 0px 0","borderWidth":"0 0 0 0px","borderStyle":"solid","height":"88rpx"}'
				 v-if="tableName=='yonghu'" class="cu-form-group">
			 <view class="title"
				   :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}'>账号
			 </view>
			 <input style="padding: 0 30upx"
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					v-model="ruleForm.username" placeholder="账号"></input>
		 </view>
		 <view
				 :style='{"boxShadow":"0 0 2rpx #07588D","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"#4477C5","margin":"0 0 0px 0","borderWidth":"0 0 0 0px","borderStyle":"solid","height":"88rpx"}'
				 v-if="tableName=='yonghu'" class="cu-form-group">
			 <view class="title"
				   :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}'>用户姓名
			 </view>
			 <input style="padding: 0 30upx"
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					v-model="ruleForm.yonghuName" placeholder="用户姓名"></input>
		 </view>
			<view
					:style='{"boxShadow":"0 0 2rpx #07588D","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"#4477C5","margin":"0 0 0px 0","borderWidth":"0 0 0 0px","borderStyle":"solid","height":"88rpx"}'
					v-if="tableName=='yonghu'" @tap="yonghuPhotoTap" class="cu-form-group">
				<view class="title"
					  :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}'>头像
				</view>
				<image
						:style='{"width":"76rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"76rpx"}'
						v-if="ruleForm.yonghuPhoto" class="avator" :src="ruleForm.yonghuPhoto" mode=""></image>
				<image
						:style='{"width":"76rpx","boxShadow":"0 0 0px rgba(0,0,0,.3)","borderRadius":"0","textAlign":"left","height":"76rpx"}'
						v-else class="avator" src="../../static/center/face.jpeg" mode=""></image>
			</view>
			<view v-if="tableName=='yonghu'"
				  :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(255, 255, 255, 0.25)","margin":"0 0 10rpx 0","borderWidth":"2rpx","height":"108rpx"}'
				  class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}'
					  class="title">性别</view>
				<picker @change="yonghusexTypesChange" :value="sexTypesIndex" :range="sexTypesOptions" range-key="indexName">
					<view style="padding: 0 30upx" :style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						  class="uni-input picker-select-input">{{ruleForm.sexValue?ruleForm.sexValue:"请选择性别"}}</view>
				</picker>
			</view>
		 <view
				 :style='{"boxShadow":"0 0 2rpx #07588D","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"#4477C5","margin":"0 0 0px 0","borderWidth":"0 0 0 0px","borderStyle":"solid","height":"88rpx"}'
				 v-if="tableName=='yonghu'" class="cu-form-group">
			 <view class="title"
				   :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}'>联系方式
			 </view>
			 <input style="padding: 0 30upx"
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					v-model="ruleForm.yonghuPhone" placeholder="联系方式"></input>
		 </view>
		 <view
				 :style='{"boxShadow":"0 0 2rpx #07588D","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"#4477C5","margin":"0 0 0px 0","borderWidth":"0 0 0 0px","borderStyle":"solid","height":"88rpx"}'
				 v-if="tableName=='yonghu'" class="cu-form-group">
			 <view class="title"
				   :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}'>邮箱
			 </view>
			 <input style="padding: 0 30upx"
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					v-model="ruleForm.yonghuEmail" placeholder="邮箱"></input>
		 </view>
		 <view
				 :style='{"boxShadow":"0 0 2rpx #07588D","backgroundColor":"rgba(247, 247, 247, 1)","borderColor":"#4477C5","margin":"0 0 0px 0","borderWidth":"0 0 0 0px","borderStyle":"solid","height":"88rpx"}'
				 v-if="tableName=='yonghu'" class="cu-form-group">
			 <view class="title"
				   :style='{"width":"160rpx","fontSize":"28rpx","color":"#4477C5","textAlign":"left"}'>身份
			 </view>
			 <input style="padding: 0 30upx"
					:style='{"boxShadow":"0 0 16rpx #07588D inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#4477C5","borderRadius":"20rpx","color":"#4477C5","textAlign":"left","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					v-model="ruleForm.yonghuShenfen" placeholder="身份"></input>
		 </view>

		<view class="btn">
			<view class="box" :style="{width: 'auto'}">
				<button @tap="update()" class="cu-btn lg"
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#4477C5","borderColor":"#4477C5","borderRadius":"8rpx","color":"#fff","borderWidth":"0","width":"auto","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'>保存</button>
			</view>
		
			<view class="box" :style="{width: 'auto'}">
				<button @tap="logout()" class="cu-btn lg"
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#4477C5","borderColor":"#E6A23C","borderRadius":"8rpx","color":"#fff","borderWidth":"0px","width":"auto","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}'>退出登录</button>
			</view>
		</view>

			<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="insertTimeConfirm"
					  ref="insertTime" themeColor="#333333"></w-picker>
			<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
					  ref="createTime" themeColor="#333333"></w-picker>

	</view>
</template>

<script>
	export default {
		data() {
			return {
				ruleForm: {},
				tableName: "",
				sexTypesOptions: [],
				sexTypesIndex: 0,
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值

			if (this.tableName == 'yonghu') {
            let sex_typesParams = {
                page: 1,
                limit: 100,
                dicCode: 'sex_types',
            }
				let sex_typesRes = await this.$api.page(`dictionary`, sex_typesParams);

				this.sexTypesOptions = sex_typesRes.data.list
			}
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			yonghusexTypesChange(e) {
				this.sexTypesIndex = e.target.value
				this.ruleForm.sexValue = this.sexTypesOptions[this.sexTypesIndex].indexName
				this.ruleForm.sexTypes = this.sexTypesOptions[this.sexTypesIndex].codeIndex
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
			// 获取uuid
			getUUID() {
				return new Date().getTime();
			},
			logout() {
				uni.setStorageSync('token', '');
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
					if ((!this.ruleForm.username) && `yonghu` == this.tableName) {
						this.$utils.msg(`账号不能为空`);
						return
					}
					if ((!this.ruleForm.yonghuName) && `yonghu` == this.tableName) {
						this.$utils.msg(`用户姓名不能为空`);
						return
					}
					if ((!this.ruleForm.yonghuPhoto) && `yonghu` == this.tableName) {
						this.$utils.msg(`头像不能为空`);
						return
					}
					if (`yonghu` == this.tableName && this.ruleForm.yonghuPhone && (!this.$validate.isMobile(this
									.ruleForm.yonghuPhone))) {
						this.$utils.msg(`联系方式应输入正确格式`);
						return
					}
					if (`yonghu` == this.tableName && this.ruleForm.yonghuEmail && (!this.$validate.isEmail(this
                                    .ruleForm.yonghuEmail))) {
                        this.$utils.msg(`邮箱应输入正确格式`);
                        return
                    }
					if ((!this.ruleForm.yonghuShenfen) && `yonghu` == this.tableName) {
						this.$utils.msg(`身份不能为空`);
						return
					}

					let table = uni.getStorageSync("nowTable");
					await this.$api.update(table, this.ruleForm);
					this.$utils.msgBack('修改成功');;
			},
			yonghuPhotoTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.yonghuPhoto = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},
            toggleTab(str) {
                this.$refs[str].show();
            }

		}
	}
</script>

<style lang="scss" scoped>
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

	.avator {
		width: 110upx;
		height: 110upx;
		border-radius: 50%;
		margin-left: 30upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.cu-btn {
		width: 100%;
	}

	.right-input {
		flex: 1;
		text-align: left;
		line-height: 88rpx;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.box {
		width: auto;
		padding: 0 10upx;
		box-sizing: border-box;
		margin-bottom: 20upx;
	}

	.cu-btn {
		width: 100% !important;
	}

	.picker-select-input {
		line-height: 88rpx;
	}
</style>
