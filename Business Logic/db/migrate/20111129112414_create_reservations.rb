class CreateReservations < ActiveRecord::Migration
  def change
    create_table :reservations do |t|
      t.integer :nbPeople
      t.date :startDate
      t.date :endDate
      t.string :lastName1
      t.string :firstName1
      t.string :lastName2
      t.string :firstName2
      t.string :lastName3
      t.string :firstName3
      t.string :lastName4
      t.string :firstName4
      t.integer :level1
      t.integer :level2
      t.integer :level3
      t.integer :level4
      t.string :language
      t.string :phone
      t.boolean :payed

      t.timestamps
    end
  end
end
