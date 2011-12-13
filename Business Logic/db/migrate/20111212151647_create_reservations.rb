class CreateReservations < ActiveRecord::Migration
  def change
    create_table :reservations do |t|
      t.integer :idMoniteur
      t.integer :idUser
      t.date :startDate
      t.date :endDate
      t.string :language
      t.boolean :payed

      t.timestamps
    end
  end
end
