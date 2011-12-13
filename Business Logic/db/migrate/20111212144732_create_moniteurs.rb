class CreateMoniteurs < ActiveRecord::Migration
  def change
    create_table :moniteurs do |t|
      t.string :name
      t.string :lastname

      t.timestamps
    end
  end
end
