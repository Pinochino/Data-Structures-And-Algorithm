    package Tutorial8.StackReversing;
    public  class SLLStack {
        private SLLNode top;

        public SLLNode getTop() {
            return top;
        }

        public void setTop(SLLNode top) {
            this.top = top;
        }


        public  boolean isEmpty(){
            if (top == null) {
                return true;
            } else {
                return false;
            }
        }

        public void push(SLLNode newNode){
            newNode.setNext(top);
            top = newNode;
        }

        public SLLNode pop(){
            if (!isEmpty()) {
               SLLNode topNode = top;
               top = top.getNext();
               return topNode;
            }
            else {
                return  null;
            }
        }

        public SLLNode peak(){
            if (!isEmpty()) {
                return top;
            } else {
                return  null;
            }
        }
    }