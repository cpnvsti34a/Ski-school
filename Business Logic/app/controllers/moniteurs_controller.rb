class MoniteursController < ApplicationController
  # GET /moniteurs
  # GET /moniteurs.json
  def index
    @moniteurs = Moniteur.all

    respond_to do |format|
      format.html # index.html.erb
      format.json { render json: @moniteurs }
    end
  end

  # GET /moniteurs/1
  # GET /moniteurs/1.json
  def show
    @moniteur = Moniteur.find(params[:id])

    respond_to do |format|
      format.html # show.html.erb
      format.json { render json: @moniteur }
    end
  end

  # GET /moniteurs/new
  # GET /moniteurs/new.json
  def new
    @moniteur = Moniteur.new

    respond_to do |format|
      format.html # new.html.erb
      format.json { render json: @moniteur }
    end
  end

  # GET /moniteurs/1/edit
  def edit
    @moniteur = Moniteur.find(params[:id])
  end

  # POST /moniteurs
  # POST /moniteurs.json
  def create
    @moniteur = Moniteur.new(params[:moniteur])

    respond_to do |format|
      if @moniteur.save
        format.html { redirect_to @moniteur, notice: 'Moniteur was successfully created.' }
        format.json { render json: @moniteur, status: :created, location: @moniteur }
      else
        format.html { render action: "new" }
        format.json { render json: @moniteur.errors, status: :unprocessable_entity }
      end
    end
  end

  # PUT /moniteurs/1
  # PUT /moniteurs/1.json
  def update
    @moniteur = Moniteur.find(params[:id])

    respond_to do |format|
      if @moniteur.update_attributes(params[:moniteur])
        format.html { redirect_to @moniteur, notice: 'Moniteur was successfully updated.' }
        format.json { head :ok }
      else
        format.html { render action: "edit" }
        format.json { render json: @moniteur.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /moniteurs/1
  # DELETE /moniteurs/1.json
  def destroy
    @moniteur = Moniteur.find(params[:id])
    @moniteur.destroy

    respond_to do |format|
      format.html { redirect_to moniteurs_url }
      format.json { head :ok }
    end
  end
end
