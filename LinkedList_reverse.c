#include <stdlib.h>
#include <stdio.h>
#include <time.h>


//node struct
typedef struct node{
	int data;
	struct node* next;
	struct node* prev;
} node_t;

//list
typedef struct list{
	struct node* head;
} list_t;

void print_list(list_t* lst);
void swap_pointers(node_t* node);


node_t* create_node(int n){
	node_t* new_node = (node_t*) malloc(sizeof(node_t));
	new_node->data = n;
	new_node->next = NULL;
	new_node->prev = NULL;
	return new_node;
}

void append(node_t* node, list_t* lst) {
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
	node->prev = current;
	}
}

void prepend(node_t* node, list_t* lst) {

	if(lst->head == NULL) {
		lst->head = node;
	} else {
		node_t* holder = lst->head;
		lst->head = node;
		node->next = holder;
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

void reverse(list_t* lst) {

	//if there is only one element in the list, return
	if(lst->head->next == NULL || lst->head == NULL) {
		return;
	}


	node_t* current;
	current = lst->head;
	node_t* holder;

	while(current != NULL) {
		holder = current;
		swap_pointers(current);
		current = current->prev;
	}

	lst->head = holder;
 
}

void swap_pointers(node_t* current) {

	node_t* next = current->next;
	node_t* prev = current->prev;

	current->next = prev;
	current->prev = next;
}

void print_list(list_t* lst) {

	if(lst->head == NULL) {
		return;
	}

  node_t* current = lst->head;
  while(current != NULL) {
  	printf("%d ", current->data);
  	current = current->next;
  }

  printf("\n");

}

void print_reverse(list_t* lst) {

	node_t* current = lst->head;

	while(current->next != NULL) {
		current = current->next;
	}

	while(current != NULL) {
		printf("%d ", current->data);
		current = current->prev;
	}

	printf("\n");


}


int main() {

 list_t* list;
 init_list(list);

 	for(int i = 0; i < 10; i++) {
 		node_t* new_node = create_node(i);
 		append(new_node, list);
 	}

 reverse(list);

 print_list(list);
// print_reverse(list);
 destory_list(list);
}
