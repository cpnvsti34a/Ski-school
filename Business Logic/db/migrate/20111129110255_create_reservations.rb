class CreateReservations < ActiveRecord::Migration
  def change
    create_table :reservations do |t|
      t.integer :nbPeople
	  t.integer :nbDays
	  t.integer :nbLionel

      t.timestamps
    end
  end
end
