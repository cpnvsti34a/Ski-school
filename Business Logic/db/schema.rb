# encoding: UTF-8
# This file is auto-generated from the current state of the database. Instead
# of editing this file, please use the migrations feature of Active Record to
# incrementally modify your database, and then regenerate this schema definition.
#
# Note that this schema.rb definition is the authoritative source for your
# database schema. If you need to create the application database on another
# system, you should be using db:schema:load, not running all the migrations
# from scratch. The latter is a flawed and unsustainable approach (the more migrations
# you'll amass, the slower it'll run and the greater likelihood for issues).
#
# It's strongly recommended to check this file into your version control system.

ActiveRecord::Schema.define(:version => 20111212151647) do

  create_table "moniteurs", :force => true do |t|
    t.string   "name"
    t.string   "lastname"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "reservations", :force => true do |t|
    t.integer  "idMoniteur"
    t.integer  "idUser"
    t.date     "startDate"
    t.date     "endDate"
    t.string   "language"
    t.boolean  "payed"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

  create_table "users", :force => true do |t|
    t.string   "username"
    t.string   "password"
    t.string   "name"
    t.string   "lastName"
    t.string   "adress"
    t.integer  "zip"
    t.string   "city"
    t.string   "country"
    t.datetime "created_at"
    t.datetime "updated_at"
  end

end
