object Form1: TForm1
  Left = 246
  Top = 133
  Width = 430
  Height = 480
  Caption = 'Form1'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  Visible = True
  OnClose = FormClose
  OnShow = FormShow
  PixelsPerInch = 96
  TextHeight = 13
  object Label1: TLabel
    Left = 72
    Top = 56
    Width = 33
    Height = 13
    Caption = 'C'#243'digo'
  end
  object Label2: TLabel
    Left = 72
    Top = 88
    Width = 28
    Height = 13
    Caption = 'Nome'
  end
  object TLabel
    Left = 72
    Top = 120
    Width = 28
    Height = 13
    Caption = 'Pre'#231'o'
  end
  object btnInserir: TButton
    Left = 8
    Top = 225
    Width = 89
    Height = 23
    Caption = 'Inserir'
    TabOrder = 0
    OnClick = btnInserirClick
  end
  object btnGravar: TButton
    Left = 104
    Top = 224
    Width = 75
    Height = 25
    Caption = 'Gravar'
    TabOrder = 1
    OnClick = btnGravarClick
  end
  object btnCancelar: TButton
    Left = 256
    Top = 224
    Width = 75
    Height = 25
    Caption = 'Cancelar'
    TabOrder = 2
    OnClick = btnCancelarClick
  end
  object btnDeletar: TButton
    Left = 336
    Top = 224
    Width = 75
    Height = 25
    Caption = 'Deletar'
    TabOrder = 3
    OnClick = btnDeletarClick
  end
  object DBGrid1: TDBGrid
    Left = 16
    Top = 272
    Width = 369
    Height = 120
    DataSource = DataSource1
    TabOrder = 4
    TitleFont.Charset = DEFAULT_CHARSET
    TitleFont.Color = clWindowText
    TitleFont.Height = -11
    TitleFont.Name = 'MS Sans Serif'
    TitleFont.Style = []
  end
  object edtCodigo: TDBEdit
    Left = 120
    Top = 56
    Width = 121
    Height = 21
    DataField = 'id_prod'
    DataSource = DataSource1
    TabOrder = 5
  end
  object edtNome: TDBEdit
    Left = 120
    Top = 88
    Width = 121
    Height = 21
    DataField = 'nome_prod'
    DataSource = DataSource1
    TabOrder = 6
  end
  object edtPreco: TDBEdit
    Left = 120
    Top = 120
    Width = 121
    Height = 21
    DataField = 'preco_prod'
    DataSource = DataSource1
    TabOrder = 7
  end
  object btnEditar: TButton
    Left = 184
    Top = 224
    Width = 65
    Height = 25
    Caption = 'Editar'
    TabOrder = 8
    OnClick = btnEditarClick
  end
  object ADOConnection1: TADOConnection
    Connected = True
    ConnectionString = 
      'Provider=MSDASQL.1;Persist Security Info=False;User ID=postgres;' +
      'Data Source=PostgreSQL30'
    LoginPrompt = False
    Left = 8
    Top = 8
  end
  object ADOQuery1: TADOQuery
    Active = True
    Connection = ADOConnection1
    CursorType = ctStatic
    Parameters = <>
    SQL.Strings = (
      'Select * from padaria.tb_produto')
    Left = 40
    Top = 8
    object ADOQuery1id_prod: TIntegerField
      DisplayWidth = 12
      FieldName = 'id_prod'
    end
    object ADOQuery1preco_prod: TBCDField
      DisplayWidth = 15
      FieldName = 'preco_prod'
      Precision = 32
      Size = 0
    end
    object ADOQuery1nome_prod: TStringField
      DisplayWidth = 39
      FieldName = 'nome_prod'
      FixedChar = True
      Size = 32
    end
  end
  object DataSource1: TDataSource
    DataSet = ADOQuery1
    Left = 24
    Top = 184
  end
end
