# K番目の数
## 問題説明
### arrayのi番目の数字からj番目の数字まで切って並び替えたとき、k番目にある数を探そうと思います。

### 例えば arrayが [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3なら

### arrayの 2番目から 5番目まで切れば [5, 2, 6, 3] です。
### 1 から出てきた配列を並べ替えると、[2、3、5、6] です。
### 2から出てきた配列の3番目の数字は5です。
### 配列array、[i,j,k]を元素とした2次元配列commandsが媒介変数として与えられるとき、commandsのすべての元素について前述の演算を適用したときに出た結果を配列に入れてreturnするようにsolution関数を作## 成してください。

## 制限事項
### arrayの長さは1以上100以下です。
### arrayの各元素は1以上100以下です。
### commands の長さは1 以上50 以下です。
### commandsの各元素は長さが3です。
### 入出力例
###       array                      commands                return
### [1, 5, 2, 6, 3, 7, 4] [[2, 5, 3], [4, 4, 1], [1, 7, 3]] [5, 6, 3] 
### 入出力例説明
### [1、5、2、6、3、7、4] を 2番目から 5番目まで切って整列します。 [2、3、5、6] の 3番目の数字は 5です。
### [1、5、2、6、3、7、4] を4番目から4番目まで切ってから並べ替えます。 [6]の最初の数字は 6です。
### [1、5、2、6、3、7、4] を 1 番目から 7 番目まで切ります。 [1、2、3、4、5、6、7] の3番目の数字は3です。
