class Ship {
    private:
        int crew;

    public: 
        Ship() {
            this->crew = 24;
        }

        void setCrew(int crew) {
            this->crew = crew; 
        }

        int getCrew() {
            return  this->crew;
        }
};
// jangan lupa diakhir class{} harus pakai `;`