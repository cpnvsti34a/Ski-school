class CreateUsers < ActiveRecord::Migration
  def change
    create_table :users do |t|
      t.string :username
      t.string :password
      t.string :name
      t.string :lastName
      t.string :adress
      t.integer :zip
      t.string :city
      t.string :country

      t.timestamps
    end
  end
end
