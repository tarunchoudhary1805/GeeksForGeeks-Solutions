<h2><a href="https://practice.geeksforgeeks.org/problems/last-seen-array-element1501/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article">Last seen array element</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:20px">Given an array <strong>arr&nbsp;</strong>of <strong>N</strong> integers that might contain duplicates, find the element whose last appearance is earliest.</span><br>
&nbsp;</p>

<p><span style="font-size:20px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:20px"><strong>Input :</strong> arr[] = {10, 30, 20, 10, 20}
<strong>Output :</strong> 30
<strong>Explanation:
</strong>Below are indexes of last
appearances of all elements (0 based
indexes). 10 last occurs at index 3
30 last occurs at index 1. 20 last
occurs at index 4 The element whose
last appearance earliest is 30.
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:20px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:20px"><strong>Input :</strong> arr[] = {10, 20, 30, 40, 10}
<strong>Output :</strong> 20
</span></pre>

<p><span style="font-size:20px"><strong>Your Task:</strong><br>
This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>lastSeenElement()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, and <strong>returns</strong>&nbsp;the element whose last appearance is earliest. The driver code takes care of the printing.</span></p>

<p><span style="font-size:20px"><strong>Expected Time Complexity:</strong>&nbsp;O(N).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N).</span></p>

<p><span style="font-size:20px"><strong>Constraints:</strong><br>
1&lt;=N&lt;=10<sup>5</sup><br>
1&lt;=arr[i]&lt;=10<sup>6</sup></span><br>
&nbsp;</p>

<p>&nbsp;</p>

<p>&nbsp;</p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Hash</code>&nbsp;<code>Data Structures</code>&nbsp;