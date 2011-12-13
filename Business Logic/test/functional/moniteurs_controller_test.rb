require 'test_helper'

class MoniteursControllerTest < ActionController::TestCase
  setup do
    @moniteur = moniteurs(:one)
  end

  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:moniteurs)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create moniteur" do
    assert_difference('Moniteur.count') do
      post :create, moniteur: @moniteur.attributes
    end

    assert_redirected_to moniteur_path(assigns(:moniteur))
  end

  test "should show moniteur" do
    get :show, id: @moniteur.to_param
    assert_response :success
  end

  test "should get edit" do
    get :edit, id: @moniteur.to_param
    assert_response :success
  end

  test "should update moniteur" do
    put :update, id: @moniteur.to_param, moniteur: @moniteur.attributes
    assert_redirected_to moniteur_path(assigns(:moniteur))
  end

  test "should destroy moniteur" do
    assert_difference('Moniteur.count', -1) do
      delete :destroy, id: @moniteur.to_param
    end

    assert_redirected_to moniteurs_path
  end
end
