#include <stdlib.h>
#include <stdio.h>
#include <time.h>


//node struct
typedef struct node{
	int data;
	struct node* next;
} node_t;

//list
typedef struct list{
	struct node* head;
} list_t;


node_t* create_node(int n){
	node_t* new_node = (node_t*) malloc(sizeof(node_t));
	new_node->data = n;
	new_node->next = NULL;
	return new_node;
}

void insert(node_t* node, list_t* lst) {

	//if list is null
	if(lst->head == NULL) {
		lst->head = node;
	} else {

    //traverse and add to the end
	node_t* current = lst->head;
	while(current->next != NULL) {
		current = current->next;
		}

	current->next = node;
	}

}

void init_list(list_t* lst) {
 list_t* list = (list_t*) malloc(sizeof(list_t));
 list->head = NULL;
}

void destory_list(list_t* lst) {

	node_t* current = lst->head;
	node_t* holder;

	//free all the nodes
	while(current != NULL) {
		holder = current;
		current = current->next;
		free(holder);
	}

}


//Get the node at index n from the back of the list
//
//Comments
// Turns out that this is a brute force solution which traverses the linked list twice
// The time complexity is just O(n) 

// However another clever implementaiton is to create a poitner that will point n nodes behind the
// current pointer

// SUppose u have a list with 5 elements and you want the second element from the last in the list,
// you iterate through the list and when you get to element 2 in your iteration you activate the 
// the result pointer to point to element 0 and it will start also iterating as you continue iterating the list
int getNode(node_t* head, int n) {

node_t* cur = head;

int total = 0;

while(cur != NULL) {
	++total;
	cur = cur->next;
}

cur = head;

int steps = total - n;

for(int i = 0; i < steps - 1; i++) {
	cur = cur->next;
}

return cur->data;

}


int main() {

 list_t* list;

 init_list(list);

 int list_len = 0;

 srand(time(0));

 //get the input from the user until they press 'n'
 	int c;
 	while((c = getchar())!= '\n') {
 		node_t* new_node = create_node(c);
 		insert(new_node, list);
 		++list_len;
 	}

 	node_t* current = list->head;

 int random = rand() % list_len;

 printf("\n PRINTING ELEMENT NUMBER: %d\n", random);
 printf("%c\n", (char) getNode(list->head, random));

 destory_list(list);

}


