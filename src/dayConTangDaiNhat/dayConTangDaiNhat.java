package dayConTangDaiNhat;

import java.util.LinkedList;

public class dayConTangDaiNhat {
	public static void main(String args[]){
		int a[]={4,5,6,8,9,1,3,7,11,15,20,10};
		LinkedList<Integer> list = new LinkedList<>();
		LinkedList<Integer> list1 = new LinkedList<>();
		int dem =0;
		int dem1 =0;
		list.addFirst(a[0]);
		for(int pos =0 ;pos< a.length; pos++){
			for(int pos1 =pos+1; pos1<a.length;pos1++){
				if(a[pos1]>list.getFirst()){
					list.addFirst(a[pos1]);
					dem++;
				}else{
					if(list.size()>1&&a[pos1]>list.get(1)){
						list.removeFirst();
						list.addFirst(a[pos1]);   
					}
				}
			}
			if(dem>dem1){
				dem1=dem;
				list1.removeAll(list1);
				list1.addAll(list);
				
				list.removeAll(list);
				if(pos!=a.length-1)
				list.addFirst(a[pos+1]);
				dem=0;
			}else{
				dem=0;
				list.removeAll(list);
				if(pos!=a.length-1)
				list.addFirst(a[pos+1]);
			}
			if(dem>a.length-pos)
				break;
		}
		System.out.println("Day tang dan dai nhat la:"+list1);
		System.out.println(dayTangDaiNhat(a,a.length,0));
	}
	public static LinkedList<Integer> dayTangDaiNhat(int a[],int n,int start){
		if(start==a.length-1){
			LinkedList<Integer> list = new LinkedList<>();
			return list;
		}else{
			LinkedList<Integer>list1= new LinkedList<>();
			list1.addFirst(a[start]);
			for(int pos1 =start; pos1<a.length;pos1++){
				if(a[pos1]>list1.getFirst()){
					list1.addFirst(a[pos1]);
				}else{
					if(list1.size()>1&&a[pos1]>list1.get(1)){
						list1.removeFirst();
						list1.addFirst(a[pos1]);   
					}
				}
			}
			return dayTangDaiNhat(a,n,start+1).size()>list1.size()?dayTangDaiNhat(a, n, start+1):list1;
	
		}
	}
}